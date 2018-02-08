package com.gookkis.kotlintipedatavariable

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //variable Integer dengan isi 0
    var angka = 100

    //variable String
    val kotaTinggal = "Semarang"

    //variable Float
    var nilaiFloat = 3.45F

    //variable Double
    var nilaiDouble = 34.5684

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //menampilkan data double
        btn_double.setOnClickListener {
            tv.text = nilaiDouble.toString()
        }

        //menampilkan data integer
        btn_integer.setOnClickListener {
            tv.text = angka.toString()
        }

        //menampilkan data string
        btn_string.setOnClickListener {
            tv.text = kotaTinggal
        }

        //menampilkan data float
        btn_float.setOnClickListener {
            tv.text = nilaiFloat.toString()
        }

    }
}

