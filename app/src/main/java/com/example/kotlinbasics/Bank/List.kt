package com.example.kotlinbasics.Bank

fun main() {
    val shoppingList = mutableListOf("snack","choco", "drinks")

    shoppingList.add("wow")
    shoppingList.remove("wow")
    shoppingList.add("wow")
    shoppingList.removeAt(3)
    shoppingList.add(1,"wow!!")
    println(shoppingList)
    println(shoppingList[1])
    shoppingList[0] = "aaa!!"
    println(shoppingList)
    shoppingList.set(1,"cool")
    println(shoppingList)

    val hasRam = shoppingList.contains("Ram")
    if (!hasRam){
        shoppingList.add("Ram")
    }
    for (item in shoppingList){
        println(item)
        if(item == "Ram"){
            println("got ram")
            break
        }
    }
    for (index in 0  until shoppingList.size ){
        println("item ${shoppingList[index]} is the item $index")

    }
    println(shoppingList)
}