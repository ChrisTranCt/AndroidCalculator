package com.example.myfirstbutton

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener{
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnMult:Button
    lateinit var btnDiv:Button
    lateinit var etA:EditText
    lateinit var etB:EditText
    lateinit var resultTy:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnAdd=findViewById(R.id.add)
        btnSub=findViewById(R.id.subtract)
        btnMult=findViewById(R.id.multiply)
        btnDiv=findViewById(R.id.divide)
        etA=findViewById(R.id.et_num1)
        etB=findViewById(R.id.et_num2)
        resultTy=findViewById(R.id.res)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMult.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
    }



    override fun onClick(v: View?) {
        var a= etA.text.toString().toDoubleOrNull()
        var b=etB.text.toString().toDoubleOrNull()
        var result=0.0
        if (a != null && b != null) { // Check if both values are valid
            // ... (perform calculations)
        when(v?.id){
            R.id.add->{
                result=a+b;
            }
            R.id.subtract->{
                result=a-b
            }
            R.id.multiply->{
                result=a*b
            }
            R.id.divide->{a/b}

        }
        resultTy.text="The result is $result"
    }
    }


}