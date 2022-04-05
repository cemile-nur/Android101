package com.cemile.android101

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun addedSuperHero(view : View){
        val name= nameText.text.toString()
        val age =ageText.text.toString().toIntOrNull()
        val job= jobText.text.toString()

        if (age == null){
            resultText.text="Doğru yaşı giriniz."
        }else {
            val superhero = Superhero(name,age,job)

            resultText.text= "İsim: ${superhero.name} \n Yaş: ${superhero.age} \n Meslek: ${superhero.job}"
        }



    }
}