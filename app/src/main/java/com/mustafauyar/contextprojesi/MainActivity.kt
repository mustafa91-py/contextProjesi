package com.mustafauyar.contextprojesi

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.mustafauyar.contextprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var toastMesaj:Toast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toastMesaj = Toast.makeText(this,"Hoşgeldiniz",Toast.LENGTH_LONG)
//        tost_mesaj.show()
    }
    fun mesajGoster(view: View){
        /*
        1 - AlertDialog.Builder da this kullanmak mantıklı yoksa çöküyor
        2 - Toast da ise yeni toast oluştur aynı toast dan oluşturusan süreler den dolayı gösterilmiyor
         */
        val uyariMesaji = AlertDialog.Builder(this)
        uyariMesaji.setTitle("şifre hatası")
        uyariMesaji.setMessage("şifre hatası, tekrar denemek ister misiniz ?")
        uyariMesaji.setPositiveButton("evet".uppercase(),DialogInterface.OnClickListener { dialog, which ->
            toastMesaj.setText("baştan deniyorusunuz")//sıfın toastı kullandım
            toastMesaj.show()
        })
        uyariMesaji.setNegativeButton("hayır") {dialog,i ->
            Toast.makeText(this,"hayırlısı artık",Toast.LENGTH_LONG).show() // yeni toast oluşturdum
//            toastMesaj.setText("hayırlısı artık")
//            toastMesaj.show()
        }
        uyariMesaji.show()
    }
}