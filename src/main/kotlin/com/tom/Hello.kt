package com.tom

fun main(args: Array<String>) {
//    println("Hello Kotlin !!!");
//    Human().hello();
    val h = Human()
    h.hello()
    //var variable 可改變 ; val 不可改變
    val age =19;//變數型態的自動推斷
    var weight =66.5;
    weight=65.0;
    var name : String;
    name = "Jasper";
}

class Human {
    fun hello(){
        println("Hello Kotlin!!!!");
    }
}