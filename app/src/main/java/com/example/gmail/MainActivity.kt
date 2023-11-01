package com.example.gmail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val language = arrayOf<String>("Title","Title","Title",".Title","Title", "Title","Title++","Title",".Title","Title")
    val description = arrayOf<String>(
        "C programming is considered as the base for other programming languages",
        "C++ is an object-oriented programming language.",
        "Java is a programming language and a platform.",
        ".NET is a framework which is used to develop software applications.",
        "Kotlin is a open-source programming language, used to develop Android apps and much more.",
        "C programming is considered as the base for other programming languages",
        "C++ is an object-oriented programming language.",
        "Java is a programming language and a platform.",
        ".NET is a framework which is used to develop software applications.",
        "Kotlin is a open-source programming language, used to develop Android apps and much more.",
    )

    val imageId = arrayOf<Int>(
        R.drawable.c,R.drawable.m,R.drawable.t,
        R.drawable.s,R.drawable.e,        R.drawable.c,R.drawable.m,R.drawable.t,
        R.drawable.s,R.drawable.e
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(this,language,description,imageId)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = id
            Toast.makeText(this@MainActivity, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }

    }
}