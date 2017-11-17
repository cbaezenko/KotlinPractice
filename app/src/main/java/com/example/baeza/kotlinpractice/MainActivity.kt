package com.example.baeza.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val array = arrayOf("gato","perro","elefante")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        left_drawer.setOnClickListener({})

        for (i in array.indices){ texto.append(array[i]+"\n") }
        texto.setTextColor(resources.getColor(R.color.colorPrimaryDark))

        button.setOnClickListener({
            texto.setText(editText.text.toString())
            changeColor(resources.getColor(R.color.error_color_material))
        })

        button2.setOnClickListener({
            changeColor(resources.getColor(R.color.primary_dark_material_light))
        })
    }

    fun changeColor(color: Int){ texto.setTextColor(color) }
}


