package com.example.project00.ui.theme

fun main(){
//    Arithmetic Operator

    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")



//    Assignment Operator

    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x + y = $z")
    z += x
    println("z += x = $z")
    z -= x
    println("z -= x = $z")
    z *= x
    println("z *= x = $z")
    z /= x
    println("z /= x = $z")
    z %= x
    println("z %= x = $z")





//    Unary Operator
    var number: Double = 7.6
    var isCheck: Boolean = true
    println("+number = ${+number}")
    println("-number = ${-number}")
    println("++number = ${++number}")
    println("--number = ${--number}")
    println("!isCheck = ${!isCheck}")
    println("---")
    var result0: Double = 4.7
    println("result : $result0")
    println("result++ : " + result0++)





//    Equality and Relational Operators

    var a: Int = 5
    var b: Int = 5

    println("a == b : " + (a == b))
    println("a != b : " + (a != b))
    println("a < b : " + (a < b))
    println("a > b : " + (a > b))
    println("a >= b : " + (a >= b))
    println("a <= b : " + (a <= b))





//    Conditional Operators
    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12
    var result1: Boolean = false

    result1 = (number1 > number2) && (number3 > number2)
    println(result1)

    result1 = (number1 > number2) || (number3 > number2)
    println(result1)




//    Operator Precedence
    var result2: Int = 5 + 2 * 4
    println("Result = " + result2)
    result2= (5 + 2) * 4
    println("Result = " + result2)
    var x0: Int = 8
    var y0: Int = 4
    var z0: Int = 2
    var sum: Int = 0
    sum = x + --y + --z
    println("x + --y + --z :: $sum")





//    rangeTo() Function and "in" operator

    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'..'j'

    var check = 'Z' in testCharRange
    println("myCharRange has Z : $check")
    println(myCharRange)
    println(testCharRange)




//    console Input in Android App Development

    print("Enter name:: ")
    var name: String? = readln()
    print("Enter age:: ")
    var age: Int = readln()!!.toInt()


}