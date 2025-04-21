package com.example.project00.ui.theme

import java.sql.DriverManager.println
import java.util.ArrayList


fun main(args: Array<String>) {

//    Array
    var age = arrayOf(1, 2, 3)
    println(age)
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    println("******************************")

    var name = arrayOf("ram", "shyam", "Hari")
    name[1] = "sandis"
    println("The first element of name is " + name[0])
    println("The second element of name is " + name[1])
    println("The third element of name is " + name[2])

    println(name.size)






//    ArrayList



    //we can add value only after our array is initialized
    var age1 = ArrayList<Int>();
    age1.add(1)
    age1.add(1,20)
    age1.add(5)


//we can add value directly in array while initializing variables.
    var age2 = arrayListOf<Int>(1,20,5)

    var name0 = arrayListOf<String>("sandis", "ram", "shyam")
    name0.add("hari")
    name0.add(4,"Sita")

    name0.remove("shyam")
    name0.removeAt(0)

    println(name)

    var mixArrayList = arrayListOf<Any>("hello",5,2.0)
    println(mixArrayList[0]);
    println(mixArrayList[1]);
    println(mixArrayList[2]);

}