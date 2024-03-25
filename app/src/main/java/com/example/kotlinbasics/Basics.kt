package com.example.kotlinbasics

fun main() {

    println("Hellp World!")
    //can change later
    var myAge: Byte = 18
    //val can not be change later its immutable
    val lastage = 99;
    println(myAge)

    var name = "Latha"
    println(name.lowercase())
    println(name.uppercase())


    var userInput = readln()
    while (userInput == "1") {
        println("while loop executed")

        // so long this content wll br executed
        println("count is $count")
        count++
        println("Loop is done ")

    }
}

