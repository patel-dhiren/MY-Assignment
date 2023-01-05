package com.app.firstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    val btnSubmit: Button
        get() = findViewById(R.id.btn_submit)
    val etName: EditText
        get() = findViewById(R.id.et_name)
    val etEmail: EditText
        get() = findViewById(R.id.et_email)
    val etAge: EditText
        get() = findViewById(R.id.et_age)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        //Toast.makeText(this, "onCreate method called", Toast.LENGTH_LONG).show()

        // button click event
        btnSubmit.setOnClickListener {
            // this block will be execute when user press submit button

            // to get value from editText
            var name = etName.text.toString().trim()
            var email = etEmail.text.toString().trim()
            var age = if (etAge.text.toString().trim().isEmpty()) {
                0
            } else {
                etAge.text.toString().trim().toInt()
            }

            var person = Person("ajay", "ajay@gmail.com", 22)

            var user = User(name, email, age)

            // passing object from one activity to another
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER" , user)
            intent.putExtra("PERSON", person)
            startActivity(intent)


            // to navigate from one activity to another activity using Intent class
            // also we can pass data from one activity to another using Intent class
          /*  var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("AGE", age)
            startActivity(intent)*/

            Toast.makeText(
                this, """
                name : $name
                email : $email
                age : $age
            """.trimIndent(), Toast.LENGTH_SHORT
            ).show()


        }


    }

}