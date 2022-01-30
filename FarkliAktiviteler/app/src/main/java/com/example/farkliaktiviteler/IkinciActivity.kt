package com.example.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci.*

class IkinciActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci)

        val intent = intent
        var alinanVeri = intent.getStringExtra("yollananVeri")
        textView2.text = alinanVeri
    }

    fun geriDon(view: View) {
        intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}