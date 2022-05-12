package com.example.thproj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class logoutActivity : AppCompatActivity()
{
    lateinit var email:EditText
    lateinit var pass:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)
        email=findViewById(R.id.editMail)
        pass=findViewById(R.id.editPass)




    }

    fun next (view: View)
    {
         /*   if (email.text.toString().isNotEmpty() && pass.text.toString()
                .isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email.text).matches())

        {
     */       val intent = Intent(this, bottomActivity::class.java)
            startActivity(intent)
        }
/*
            else

            {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("У вас есть незаполненные поля")
                    .setPositiveButton("ок", null)
                    .create()
                    .show()
            }
    }
*/

}




