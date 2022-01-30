package com.example.contextprojesi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast, Alert

        //applicationContext
        //this, this@MainActivity
        Toast.makeText(this, "Hoşgeldin!", Toast.LENGTH_LONG).show()

    }

    fun mesajGoster(view: View) {
        val uyariMesaji = AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("Şifre Hatası")
        uyariMesaji.setMessage("Şifre girmek ister misiniz?")
        uyariMesaji.setPositiveButton(
            "Evet",
            DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Baştan deneyin", Toast.LENGTH_LONG).show()
            })
        uyariMesaji.setNegativeButton("Hayır") { dialogInterface, i ->
            Toast.makeText(this, "Hayırı seçtiniz", Toast.LENGTH_LONG).show()
        }

        uyariMesaji.show()
    }
}