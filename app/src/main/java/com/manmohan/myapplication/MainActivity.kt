package com.manmohan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info_tv.text = "App Info : \nApp ID : ${BuildConfig.APPLICATION_ID} \n" +
                "App Version Code : ${BuildConfig.VERSION_CODE} \n" +
                "App Version Name : ${BuildConfig.VERSION_NAME} \n" +
                "App Build Type : ${BuildConfig.BUILD_TYPE} \n" +
                "App Flavor : ${BuildConfig.FLAVOR} \n"
    }
}
