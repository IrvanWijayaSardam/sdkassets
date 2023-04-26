package com.aminivan.mylibrary.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.IOException

class ImageUtils {
    companion object {
        fun getBitmapFromAsset(context: Context, filePath: String): Bitmap? {
            val assetManager = context.assets

            return try {
                val inputStream = assetManager.open(filePath)
                BitmapFactory.decodeStream(inputStream)
            } catch (e: IOException) {
                e.printStackTrace()
                null
            }
        }
    }

}