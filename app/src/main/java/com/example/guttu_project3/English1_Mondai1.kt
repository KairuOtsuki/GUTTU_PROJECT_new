package com.example.guttu_project3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class English1_Mondai1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_english1_mondai1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //ホームボタンを読み込み
        val home : Button =findViewById(R.id.home)
        //ホームを押したら、ホーム画面に映る
        home.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        //戻るボタンを読み込み
        val back_button : Button = findViewById(R.id.back_button)
        //戻るボタンを押したら英語ホーム１に戻る
        back_button.setOnClickListener {
            val intent = Intent(this,English_Home1::class.java)
            startActivity(intent)
        }
    }
}