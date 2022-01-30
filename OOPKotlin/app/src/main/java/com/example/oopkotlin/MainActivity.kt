package com.example.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("----Sınıflar----")
        val kullanici = Kullanici("Ozan", 20)
        val digerkullanici = Kullanici("Can", 30)

        println("----Encapsulation----")
        val ahmet = Sanatci("Ahmet", 50, "Müzisyen")
        println(ahmet.isim)
        //ahmet.isim = ""

        println("----Inheritance----")
        val mehmet = OzelSanatci("Mehmet", 40, "Tiyatrocu")
        mehmet.sarkiSoyle()

        println("----Polymorphism----")
        //Statik
        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(2, 3))
        println(islem.carpma(2, 3, 4))

        //Dinamik
        val barley = Kopek()
        barley.sesCikar()
        barley.kopekFonksiyonu()

        println("----Abstraction & Intefaces----")
        kullanici.insanFonksiyonu()
        var gitar = Gitar()
        gitar.marka = "Gitar Markası"
        gitar.elektro = true
        gitar.bilgi()
        println(gitar.oda)

        println("----Lambda----")
        yazdigimiYazdir("test")
        val yazdigimiYazdirLambda = { verilenString: String -> println(verilenString) }
        yazdigimiYazdirLambda("test lambda")
        val carpmaIslemiLambda = { a: Int, b: Int -> a * b }
        println(carpmaIslemiLambda(6, 7))
        val carpmaIslemiLambdaV2: (Int, Int) -> Int = { a, b -> a * b }
        println(carpmaIslemiLambda(6, 7))
    }

    fun yazdigimiYazdir(string: String) {
        println(string)
    }

    init {
        println("init çağrıldı")
    }
}