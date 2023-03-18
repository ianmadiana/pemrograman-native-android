//kotlin/android studio memanggil paket aplikasi bernama package com.example.happybirthday
package com.example.happybirthday

//kotlin mengimpor kelas androidx.appcompat.app.AppCompatActivity
//dan kelas android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Pada kelas MainActivity program akan dicompile dan dijalankan
class MainActivity : AppCompatActivity() {
    //Pada kode program ini diciptakan fungsi onCreate digunakan sebagai kondisi awal
    //activity diciptakan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //R.layout.actity_main akan mereferensikan layout pada activity_main.xml
        setContentView(R.layout.activity_main)
    }
}