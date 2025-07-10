package com.example.test_kotlin_sql

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var angkaBulat: Int = 0
    var angkaDesimal: Double = 0.0
    var angkaPanjang: Long = 900000000000L

    var karakter: Char = 'A'
    var kata: String = "Hello, World!"

    var benar: Boolean = true
    var salah: Boolean = false

    var angkaArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var stringArray: Array<String> = arrayOf("Kotlin", "Java", "Python")
    var booleanArray: Array<Boolean> = arrayOf(true, false, true)

    fun hitung(angka: Int, kata: String) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hitung(10, "Kotlin")

        if(angkaBulat==4 && angkaDesimal>3.14){
            benar = true
            kata = "Angka Bulat adalah 4"
        } else {
            benar = false

        }
    }
}