package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var pizza: CheckBox;
    lateinit var kawa: CheckBox;
    lateinit var burger: CheckBox;
    lateinit var button: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pizza = findViewById(R.id.pizzaBox)
        kawa = findViewById(R.id.kawaBox)
        burger = findViewById(R.id.hamBox)
        button = findViewById(R.id.koniecbtn)

        button.setOnClickListener {
            var totalAmount: Int = 0;
            val result = StringBuilder();
            result.append("Wybrane produkty")
            if(pizza.isChecked) {
                result.append("\nPizza 30zł")
                totalAmount += 30;
            }
            if(kawa.isChecked) {
                result.append("\nKawa 10zł")
                totalAmount += 10;
            }
            if(burger.isChecked) {
                result.append("\nHamburger 25zł")
                totalAmount += 25;
            }
            result.append("\nRazem: " + totalAmount + "zł")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}