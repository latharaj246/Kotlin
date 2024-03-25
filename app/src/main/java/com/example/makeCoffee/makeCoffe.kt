package com.example.makeCoffee
data class CoffeeDetails(val sugercount: Int,val name: String,val size:String,val creamAmount:Int)

fun main(){
val coffeeForLatha = CoffeeDetails(1,"Latha","XL",2)
    makeCoffe(coffeeForLatha)
}
fun askCoffeDetails(){
    //call our function
    println("coffee for?")
    val name = readln()
    println("spoons of suger?")
    val suger = readln()

    val sugercountInt = suger.toInt()
//    makeCoffe(sugercountInt , name)
//    makeCoffe(0 , "Vidya")
}
//Define function
fun makeCoffe(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugercount == 1){

        println("${coffeeDetails.size} Coffe with  ${coffeeDetails.sugercount} spoon of suger and ${coffeeDetails.creamAmount} of cream for ${coffeeDetails.name}")
    }else if(coffeeDetails.sugercount == 0){
        println("${coffeeDetails.size} Coffe with no  suger and ${coffeeDetails.creamAmount} of cream  for ${coffeeDetails.name}")
    }else {
        println("${coffeeDetails.size} Coffe with ${coffeeDetails.sugercount} spoons of suger and ${coffeeDetails.creamAmount} of cream  for ${coffeeDetails.name}")
    }


}