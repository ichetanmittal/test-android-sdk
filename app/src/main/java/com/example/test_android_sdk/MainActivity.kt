package com.example.test_android_sdk

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.android_sdk.WebViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Add a button to launch the WebView with the Netlify URL
        findViewById<Button>(R.id.launchWebView).setOnClickListener {
            // Use the default Netlify URL (which should be updated with our latest changes)
            WebViewActivity.launch(this)
        }
        
        // Add a button to launch the Test activity
        findViewById<Button>(R.id.testButton).setOnClickListener {
            TestActivity.launch(this)
        }
    }
}