package com.github.chelovekdrakon.ex1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById<TextView>(R.id.title2)
        textView.setOnClickListener {
            openBrowser("https://sharekey.com")
        }
    }

    private fun openBrowser(url: String) {
        val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
