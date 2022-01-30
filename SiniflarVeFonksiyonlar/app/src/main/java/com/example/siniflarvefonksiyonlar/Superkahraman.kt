package com.example.siniflarvefonksiyonlar

class Superkahraman {
    var isim = ""
    var yas = 0
    var meslek = ""
    private var sacRengi = "Sarı"

    constructor() {}

    constructor(isim: String, yas: Int, meslek: String) {
        this.isim = isim
        this.yas = yas
        this.meslek = meslek
    }

    fun testFonksiyonu() {
        println("test")
    }
}