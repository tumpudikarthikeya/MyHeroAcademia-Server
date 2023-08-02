package com.example

import com.example.models.ApiResponse
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.server.testing.*
import kotlin.test.*
import io.ktor.http.*
import com.example.plugins.*
import com.example.repository.HeroRepository
import com.example.repository.HeroRepositoryImpl
import com.example.repository.NEXT_PAGE
import com.example.repository.PREV_PAGE
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class ApplicationTest {
    @Test
    fun `access root endpoint, assert correct information`() = testApplication {
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello!, Welcome to My Hero Academia Api", bodyAsText())
        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access allHeroes ,assert correct information`() = testApplication{
        val heroRepository = HeroRepositoryImpl()
        val pages = 1..5
        val heroes = listOf(
            heroRepository.page1,
            heroRepository.page2,
            heroRepository.page3,
            heroRepository.page4,
            heroRepository.page5,

            )
        pages.forEach { page->
            val response = client.get("/MHA/heroes?page=$page")
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            assertEquals(expected = HttpStatusCode.OK , actual = response.status)
            val expected = ApiResponse(
                success = true,
                message = "ok",
                prevPage = calcPages(page = page)[PREV_PAGE] ,
                nextPage = calcPages(page = page)[NEXT_PAGE],
                heroes = heroes[page-1],
                lastUpdated = actual.lastUpdated)


            assertEquals(expected = expected , actual = actual)
        }


    }

    @ExperimentalSerializationApi
    @Test
    fun `access all hero end point , query non existing page,assert error`() = testApplication{

        val response = client.get("/MHA/heroes?page=9")
        assertEquals( expected = HttpStatusCode.NotFound , actual =  response.status)
        assertEquals( expected = "Page Not Found" , actual =  response.bodyAsText())

    }


    @ExperimentalSerializationApi
    @Test
    fun `access all hero end point , query invalid page,assert error`() = testApplication{

        val response = client.get("/MHA/heroes?page=hi")
        assertEquals( expected = HttpStatusCode.BadRequest , actual =  response.status)
        val expected = ApiResponse(
            success = false,
            message = "Only Numbers are Allowed",
        )
        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
        assertEquals( expected = expected , actual =  actual)

    }

    @ExperimentalSerializationApi
    @Test
    fun `access search heroes end point , query hero name,assert single list as result`() = testApplication{

        val response = client.get("/MHA/heroes/search?name=All Might")
        assertEquals( expected = HttpStatusCode.OK , actual =  response.status)
        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            .heroes.size
        assertEquals( expected = 1 , actual = actual)

    }
    @ExperimentalSerializationApi
    @Test
    fun `access search heroes end point , query hero name ,assert multiple list as result`() = testApplication{

        val response = client.get("/MHA/heroes/search?name=hot")
        assertEquals( expected = HttpStatusCode.OK , actual =  response.status)
        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            .heroes.size
        assertEquals( expected = 2 , actual = actual)

    }
    @ExperimentalSerializationApi
    @Test
    fun `access search heroes end point , query hero name ,assert empty list as result`() = testApplication{

        val response = client.get("/MHA/heroes/search?name=abc")
        assertEquals( expected = HttpStatusCode.OK , actual =  response.status)
        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            .heroes
        assertEquals( expected = emptyList() , actual = actual)

    }

    @ExperimentalSerializationApi
    @Test
    fun `access non existing endpoint,assert not found`() =
        testApplication {
            val response = client.get("/unknown")
            assertEquals(expected = HttpStatusCode.NotFound, actual = response.status)
            assertEquals(expected = "Page Not Found", actual = response.bodyAsText())
        }

    private fun calcPages(page :Int): Map<String,Int?>{
        var prevPage:Int? = page
        var nextPage :Int?= page
        if (page in 2..5){
            prevPage = prevPage?.minus(1)
        }
        if (page in 1..4){
            nextPage = nextPage?.plus(1)
        }
        if (page == 1){
            prevPage = null
        }
        if (page == 5){
            nextPage = null
        }
        return mapOf(PREV_PAGE to prevPage , NEXT_PAGE to nextPage)
    }

}
