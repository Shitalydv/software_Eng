package com.example.project00.ui.theme

import kotlin.random.Random



fun main(){

//    If-Else Statement
    print("Please enter a number : ")
    var number:Any = readln()!!.toInt()
    if(number.toString().toInt() % 2 == 0){
        println("$number is even")
    }else{
        println("$number is odd")
    }



//    If-Else - if ladder statement
    print("Please enter your age :: ")
    var yourAge: Int = readln()!!.toInt()
    if (yourAge < 13) {
        print("You are a child")
    } else if (yourAge < 19) {
        print("You are a teenager")
    } else {
        if (yourAge < 50) {
            print("You are an adult")
        } else {
            print("You are a senior")
        }
    }




//    Nested If statement

    println("Please enter 3 numbers : ")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()
    var largestNumber: Int
    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }
    println("The largest number is $largestNumber")



//    When statement
    print("Please enter a day number of week : - ")
    var dayNumber:Int = readln()!!.toInt()
    var day:String
    when(dayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }
    println(day)




//    For Loop
    for (i in 1..9){
        println(i)
    }

    var sum0:Int = 0
    for(x in 0..5){
        println(x)
        sum0 +=x // sum = sum + x
    }

    var sum: Int = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sum += x // sum = sum + x
        }
    }
    println("The sum of even number is $sum")



    var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
    for(y in vehicle.indices){
        println("The value in $y index is : - "+ vehicle[y])
    }





//    For each Loop
    var vehicle0 = arrayListOf<String>("TATA", "Kia", "Hyundai", "MG")
    vehicle0.forEach { it: String ->
        println(it)
    }



//    While Loop
    var i:Int=0;
    while (i<5){
        println(i)
        i++;
    }

    //3 -> 3*2*1 factorial of 3 - 3!
//5 -> 5*4*3*2*1 factorial of 5 - 5!
// In math factorial is represented by ! -> 5!

    var k = 1
    var fact = 1
    while (k<6){ //setting the conditions while k < 6
        fact*k; // fact = fact * k
        println("$k! = $fact");
        k++;
    }



//    Infinite Loop
    var number0 = Random.nextInt(0, 10000)
    println("Please enter ANY number from 0 to 10000: - ")
    while (2>1) {
        var userGuess:Int = readLine()!!.toInt()
        if(userGuess == number) {
            println("congratulations!!!!, you won")
            break
        } else if(userGuess<number0) {
            println("Increase your guess")
        } else {
            println("Decrease your guess")
        }
    }



//    Do-while Loop
    var number8 = 1
    do {
        println(number8)
        number8++
    } while (number8 <= 15)






}