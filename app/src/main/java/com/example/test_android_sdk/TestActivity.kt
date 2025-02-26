package com.example.test_android_sdk

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TestActivity : AppCompatActivity() {

    companion object {
        @JvmStatic
        fun launch(context: Context) {
            val intent = Intent(context, TestActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        // Enable back button in action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Test Page"

        // Add a button to go back to main activity
        findViewById<Button>(R.id.backToMainButton).setOnClickListener {
            finish()
        }
    }

    // Handle action bar back button
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
