package com.app.firstapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    val tvResult: TextView
        get() = findViewById(R.id.tv_result)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Receive parcelable object
        var user = intent.getParcelableExtra<User>("USER")
        var person = intent.getParcelableExtra<Person>("PERSON")
        // Receive value using intent
        /*  var name = intent.getStringExtra("NAME")
          var email = intent.getStringExtra("EMAIL")
          var age = intent.getIntExtra("AGE", 0)*/

        // dynamically update textview value using text property
        if (user != null) {
            tvResult.text = """
            name : ${user.name}
            email : ${user.email}
            age :${user.age}
        """.trimIndent()
        }

    }

}