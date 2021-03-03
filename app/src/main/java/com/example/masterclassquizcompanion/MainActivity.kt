package com.example.masterclassquizcompanion


import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import android.widget.Toolbar

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }


        toolbar.setTitle("");
        setSupportActionBar(toolbar)





    btn_start.setOnClickListener {
        if(et_name.text.toString().isEmpty()){
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT)
        }else{
            val intent = Intent(this, QuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, et_name.text.toString())
            startActivity(intent)
            finish()

        }
    }

    }



}