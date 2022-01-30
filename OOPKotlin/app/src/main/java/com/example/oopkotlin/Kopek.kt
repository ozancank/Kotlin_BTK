package com.example.oopkotlin

class Kopek : Hayvan() {
    fun kopekFonksiyonu() {
        super.sesCikar()
    }

    override fun sesCikar() {
        println("köpek sınıfı")
    }
}