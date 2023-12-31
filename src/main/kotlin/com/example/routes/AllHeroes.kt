package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException

fun Route.getAllHeroes(){
    val heroRepository:HeroRepository by inject()
    get("/MHA/heroes") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)


            val apiResponse = heroRepository.getAllHeroes(page)

            call.respond(message = apiResponse)


        }catch (e: NumberFormatException){
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers are Allowed"),
                status = HttpStatusCode.BadRequest
            )
        }catch (e: IllegalArgumentException){
            call.respond(
                message = ApiResponse(success = false, message = "Heroes Not Found"),
                status = HttpStatusCode.NotFound
            )
        }
    }
}