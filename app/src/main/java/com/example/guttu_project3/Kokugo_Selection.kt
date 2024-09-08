package com.example.guttu_project3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent

class Kokugo_Selection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kokugo_selection)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //戻るボタンを読み込み
        val back_button :Button = findViewById(R.id.back_button)
        //戻るボタンを押したらホームに戻る
        back_button.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        //国語Ⅰのボタンを読み込み
        val button1 :Button =findViewById(R.id.button1)
        //国語Ⅰのボタンを押したら、国語ホーム１に移る
        button1.setOnClickListener {
            val intent = Intent(this,Kokugo_Home1::class.java)
            startActivity(intent)
        }
    }
}