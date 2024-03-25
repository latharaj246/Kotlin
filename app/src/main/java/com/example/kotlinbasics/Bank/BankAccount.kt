package com.example.kotlinbasics.Bank

class BankAccount (var accoutHolder : String, var balance : Double) {


    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        //balance = balance + amount
        transactionHistory.add("$accoutHolder deposited $amount ")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            //we can withdraw
            balance  -= amount
            transactionHistory.add("$accoutHolder withdrew $amount")
        } else {
            //we can not withdraw
            println("you can not withdraw")
        }

    }

    fun displayTransactionHistory() {
        println("transaction history for $accoutHolder")
        for(item in transactionHistory){
            println(transactionHistory)
        }

    }
}