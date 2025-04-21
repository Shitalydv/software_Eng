package com.example.project00.ui.theme

import android.renderscript.Element.DataType
import java.sql.DriverManager.println
import java.util.ArrayList

fun main(){
//    mutable
//    we can reassign values to mutable variable
    var age = 20;
    age = 25

    //immutable
//    we can't re assign values to immutable variables
    val roll = 15

    //roll = 10 // this is incorrect because it has't describe datatype




//    DataType

    var a : Boolean = true
    var b : Char = 'R'
    var c : Byte = 12
    var d : Short = -356
    var e : Int = 43543
    var f : Long = -51321354L
    var i : Float = 5.6451344F
    var h : Double = 7.32644564

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)



//    Type convversion


    var x: Double = 132.32
    var y: Int = x.toInt()
    var z: Byte = y.toByte()

    println(x)
    println(y)
    println(z)






    var a1: String = "Hello world"
    var i1: Int = a1.length
    var x1: Boolean = a.equals("Hello world")
    var username: String = "    softwarica   "

    println(username.trim())
    println(a1)
    println(i1)
    println(a1.isEmpty())
    println(a1.lowercase())
    println(a1.uppercase())
    println(x1)
    print(a1.plus(", How are you?"))


}