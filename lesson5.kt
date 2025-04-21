package com.example.project00.ui.theme

fun main(){

//   1 List

        val numbers: List<String> = listOf("one", "two", "three", "four")

        println("Number of elements: ${numbers.size}")
        println("Third element: ${numbers.get(2)}")
        println("Fourth element: ${numbers[3]}")
        println("Index of element \"two\": ${numbers.indexOf("two")}")


//        1.1 mutable and immutable list


        // Immutable List
        val lst = listOf("one", "two", "three")
        println("Immutable list")  // Corrected label
        for(i in lst.indices) {
            println(lst[i])
        }
        println()

        // Mutable List
        val mutableLst = mutableListOf("one", "two", "three")
        mutableLst.add("Four")
        println("Mutable list")  // Corrected label
        for(i in mutableLst.indices) {
            println(mutableLst[i])
        }




//        2. set

        val numbers0 = setOf(1, 2, 3, 4)
        for(elements in numbers0) {
            println(elements)
        }

        val numbersBackwards = setOf(4, 3, 2, 1)
        println("The sets are equal: ${numbers0 == numbersBackwards}")



//        3.Map
        val countriesCapitals = mapOf(
            "Nepal" to "Kathmandu",
            "China" to "Beijing",
            "India" to "New Delhi"
        )

        println("All keys: ${countriesCapitals.keys}")
        println("All values: ${countriesCapitals.values}")
        println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")





//        Example : (Immutable Map)
        val studentMarks = mapOf(
            "ram" to 45,
            "shyam" to 45,
            "hari" to 45,
            "gita" to 45,
        )
        println("Enter student name: ")
        val input: String = readln().lowercase()
        println(studentMarks[input] ?: "Student not found")  // Adding null check



//        Example: (Mutable Map)

        val studentMarks0 = mutableMapOf(
            "ram" to 45,
            "shyam" to 45,
            "hari" to 45,
            "gita" to 45,
        )

        studentMarks0["ram"] = 60
        studentMarks0.put("sabin", 80)
        println("Enter student name: ")
        val input0: String = readln().lowercase()
        println(studentMarks0[input] ?: "Student not found")  // Fixed syntax and added null check



//
//        Your task
//
//                Create a Dictionary app using mapOf()
    //                function where user will type a word and your program should
    //                return the meaning of that word.


    val dictionary = mapOf(
        "apple" to "fruit",
        "book" to "for reading",
        "cat" to "animal"
    )

    print("Enter word: ")
    val word = readln().lowercase()

    println(dictionary[word] ?: "Word not found")

}