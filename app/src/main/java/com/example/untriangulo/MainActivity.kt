package com.example.untriangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("quiobole prros")

        val myDrawing = MyDrawable()
        val image: ImageView = findViewById(R.id.imageView)
        image.setImageDrawable(myDrawing)
        image.contentDescription = resources.getString(R.string.app_name)

    }
}
