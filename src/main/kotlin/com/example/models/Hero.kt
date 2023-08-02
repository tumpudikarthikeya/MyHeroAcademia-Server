package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Hero(
    val id:Int,
    val name:String,
    val alias :String,
    val image:String,
    val about :String,
    val rating :Double,
    val occupation :String,
    val quirk :String,
    val month : String,
    val day :String,
    val status :String,
    val affiliation :String,
    val fightingStyle : String,
)
