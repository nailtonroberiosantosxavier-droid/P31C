package com.example.p31c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class RFC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rfc)
        supportActionBar?.hide()

        val webView = findViewById<WebView>(R.id.webView)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.rfc-editor.org/rfc-index.html")
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
    }
}
