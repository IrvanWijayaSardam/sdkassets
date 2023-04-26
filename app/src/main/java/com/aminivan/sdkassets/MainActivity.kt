package com.aminivan.sdkassets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.aminivan.mylibrary.utils.ImageUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = ImageUtils.getBitmapFromAsset(this, "Please.jpg")
        val ivMain = findViewById<ImageView>(R.id.ivMain)
        ivMain.setImageBitmap(bitmap)

    }
}