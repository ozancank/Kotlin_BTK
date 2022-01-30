package com.example.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("merhaba kotlin")

        //Degiskenler
        var a = 5
        var b = 10
        println(a * b)
        var yas = 50
        yas = 60
        val x = 8 //sabit
        println(yas / 5 * x)
        //Tanımlama
        var myInt: Int = 5
        var myFloat: Float = 3.14f
        var myDouble: Double = 3.14
        val myString = "Benim Yeni Metnim"
        println(myString.length)
        val myBoolean: Boolean = true
        val myString2 = "50"
        val parseInt = myString2.toInt()
        println(parseInt / 10)
        //Diziler
        var stringOrnegi = "a"
        val benimDizim = arrayOf(stringOrnegi, "b", "c", "d", 1)
        println(benimDizim[0])
        println(benimDizim.get(1))
        benimDizim.set(0, "ff")
        println(benimDizim.get(0))
        val numaraDizisi = doubleArrayOf(1.0, 2.0)
        println(numaraDizisi[0])
        val myArrayList = arrayListOf<String>("a", "b", "c")
        val myArrayList2 = arrayListOf("a", "b", 1.2)
        myArrayList.add("d")
        myArrayList2.add(3)
        println(myArrayList[3] + myArrayList2[3])
        //Set (Değerler Tekil olmalı)
        val ornekSet = setOf<Int>(7, 8, 8, 8, 10)
        println(ornekSet.size)
        ornekSet.forEach {
            println(it)
        }
        val ornekSet2 = HashSet<String>()
        ornekSet2.add("a")
        ornekSet2.add("a")
        ornekSet2.add("b")
        ornekSet2.add("b")
        ornekSet2.forEach {
            println(it)
        }
        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("Elma", 100)
        yemekKaloriMap.put("Et", 200)
        yemekKaloriMap.put("Tavuk", 300)
        println(yemekKaloriMap.get("Elma"))
        val ornekMap = HashMap<String, String>()
        ornekMap.put("a", "b")
        val ornekMap2 = hashMapOf<String, Int>("a" to 1, "b" to 2)

        //If
        val skor = 10

        if (skor < 10) {
            println("x")
        } else {
            println("y")
        }

        //when
        var notRakami = 10

        when (notRakami) {
            0 -> println(notRakami)
            10 -> println(notRakami + 5)
            else -> println(notRakami - 5)
        }

        //Donguler
        val myArray = arrayOf(5, 10, 15, 20, 25, 30)
        for (num in myArray) {
            if (num % 2 == 0)
                println(num)
        }

        for (index in myArray.indices) {
            println(index)
        }

        for (b in 0..9) {
            println(b)
        }

        var j = 0
        while (myArray[j] < 25) {
            println(myArray[j])
            j++
        }
    }
}