package com.example.ambilwarnadialog_colorpickingdialog

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import yuku.ambilwarna.AmbilWarnaDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            AmbilWarnaDialog(this,Color.BLACK,object :AmbilWarnaDialog.OnAmbilWarnaListener{
                
                override fun onOk(dialog: AmbilWarnaDialog?, color: Int) {
                    tv.setTextColor(color)
                }

                override fun onCancel(dialog: AmbilWarnaDialog?) {
                    Toast.makeText(this@MainActivity,"canceled",Toast.LENGTH_SHORT).show()
                }
            }).show()
        }
    }
}
