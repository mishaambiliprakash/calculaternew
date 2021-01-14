package com.misha.calculaternew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MultiplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication)
    }

    fun mybtnclick(view: View) {
        var getnum1=findViewById<EditText>(R.id.num1);
        var getnum2=findViewById<EditText>(R.id.num2);
        var num1=getnum1.text.toString();
        var num2=getnum2.text.toString();
        var result:Double=num1.toDouble()*num2.toDouble();
        Toast.makeText(this,result.toString(), Toast.LENGTH_LONG).show();

    }
    fun backclick(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}