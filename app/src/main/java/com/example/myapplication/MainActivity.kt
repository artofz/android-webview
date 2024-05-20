package com.example.myapplication

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient()  // 링크 클릭 시 새 창이 아닌 WebView 내에서 열리도록 설정
        webView.settings.javaScriptEnabled = true  // 자바스크립트 사용 가능하도록 설정

        webView.loadUrl("https://www.naver.com")  // 로드할 URL 입력

    }
}