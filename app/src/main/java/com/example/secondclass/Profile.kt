package com.example.secondclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        /*val value = intent.getStringExtra("name")
        nameText.text = value*/

        val student: Student? = intent.getParcelableExtra("student")

        if (student != null){
            profileImage.setImageURI(student.uri)
            nameText.text = student.name
            emailText.text = student.email
            genderText.text = student.gender
            timeText.text = student.date
            bloodText.text = student.blood
            skillsText.text = student.skill
        }

    }
}