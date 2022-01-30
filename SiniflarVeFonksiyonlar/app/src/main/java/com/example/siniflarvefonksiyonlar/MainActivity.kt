package com.example.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ilkFonksiyon()

        cikarma(10, 20)

        button.setOnClickListener {
            textView.text = "Sonuç: ${toplama(10, 20)}"
        }

        SinifCalismasi()
        nullGuvenligi()
    }

    private fun ilkFonksiyon() {
        println("çalıştı")
    }

    fun cikarma(x: Int, y: Int) {
        textView.text = "Sonuc: ${x - y}"
    }

    fun toplama(a: Int, b: Int): Int {
        return a + b
    }

    /*
    fun degistir(view: View) {
        textView.text = "Sonuç: ${toplama(10, 20)}"
    }
    */

    fun SinifCalismasi() {
        var superman = Superkahraman()
        superman.isim = "Superman"
        superman.meslek = "Gazeteci"
        superman.yas = 50

        var batman = Superkahraman("batman", 30, "abc")

        superman.testFonksiyonu()
        textView.text = "Yaş: ${batman.yas}"
    }

    fun nullGuvenligi() {
        var benimString: String?
        benimString = null;

        var benimYasim: Int? = null
        //Kesinlikle null olmayacaksa !! işareti yazılır.
        println(benimYasim?.minus(2))

        println(benimYasim?.minus(2) ?: 10)

        benimYasim?.let {
            println(it * 5)
        }
    }
}