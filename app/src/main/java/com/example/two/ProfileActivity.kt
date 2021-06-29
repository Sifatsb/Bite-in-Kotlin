package com.example.two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val student :Student? = intent.getParcelableExtra("student")

        if (student != null){
            profileImage.setImageURI(student.uri)
            emailId.text = student.email
            genderId.text = student.gender
            dateId.text = student.date
            timeId.text = student.time
            bloodId.text = student.blood
            languageId.text = student.language
        }

    }
}