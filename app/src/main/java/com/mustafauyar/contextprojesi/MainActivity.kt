package com.mustafauyar.contextprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mustafauyar.contextprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var tost_mesaj:Toast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tost_mesaj = Toast.makeText(this,"Hoşgeldiniz",Toast.LENGTH_LONG)
//        tost_mesaj.show()
    }
    fun mesajGoster(view: View){
        tost_mesaj.show()
    }
}