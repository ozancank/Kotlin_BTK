package com.example.sqliteogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val veritabani = this.openOrCreateDatabase("Urunler", MODE_PRIVATE, null)
            veritabani.execSQL("CREATE TABLE If NOT EXISTS urunler (id INTEGER PRIMARY KEY,isim VARCHAR, fiyat INT)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Ayakkabı',100)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Tshirt',50)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Elbise',150)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Atkı',200)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Bere',10)")

            val cursor=veritabani.rawQuery("SELECT * FROM urunler",null)

            val idColumnIndex=cursor.getColumnIndex("id")
            val isimColumnIndex=cursor.getColumnIndex("isim")
            val fiyatColumnIndex=cursor.getColumnIndex("fiyat")

            while (cursor.moveToNext()){
                println("Id: ${cursor.getInt(idColumnIndex)}")
                println("İsim: ${cursor.getString(isimColumnIndex)}")
                println("Fiyat: ${cursor.getInt(fiyatColumnIndex)}")
            }

            cursor.close()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}