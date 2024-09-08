package com.example.guttu_project3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class English_Selection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_english_selection)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //戻るボタンを読み込み
        val back_button : Button = findViewById(R.id.back_button)
        //戻るボタンを押したらホームに戻る
        back_button.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        //英語Ⅰのボタンを読み込み
        val button1 :Button =findViewById(R.id.button1)
        //英語Ⅰのボタンを押したら、英語ホーム１に移る
        button1.setOnClickListener {
            val intent = Intent(this,English_Home1::class.java)
            startActivity(intent)
        }
    }
}