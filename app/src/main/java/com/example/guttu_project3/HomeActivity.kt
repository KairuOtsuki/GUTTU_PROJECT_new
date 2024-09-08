package com.example.guttu_project3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //国語のボタンを読み込み
        val kokugo :Button =findViewById(R.id.kokugo)
        //国語のボタンを押したら、学習プランに移る
        kokugo.setOnClickListener {
            val intent = Intent(this,Kokugo_Selection::class.java)
            startActivity(intent)
        }
        //数学のボタンを読み込み
        val math :Button =findViewById(R.id.math)
        //数学のボタンを押したら、学習プランに移る
        math.setOnClickListener {
            val intent = Intent(this,Math_Selection::class.java)
            startActivity(intent)
        }
        //英語のボタンを読み込み
        val english :Button =findViewById(R.id.english)
        //英語のボタンを押したら、学習プランに移る
        english.setOnClickListener {
            val intent = Intent(this,English_Selection::class.java)
            startActivity(intent)
        }
        //プロフィールボタンを読み込み
        val profile :Button =findViewById(R.id.profile)
        //プロフィールボタンを押したら、プロフィール画面に映る
        profile.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
