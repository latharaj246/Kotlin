package com.example.kotlinbasics.Bank

fun main() {

    val lathaBankaccount = BankAccount("Latha" , 5000.00)
    lathaBankaccount.deposit(55.555)
    lathaBankaccount.displayTransactionHistory()
    lathaBankaccount.withdraw(5.5)
    lathaBankaccount.displayTransactionHistory()
    lathaBankaccount.deposit(5.5)
    println("${lathaBankaccount.balance}")
    println(lathaBankaccount.accoutHolder)


}