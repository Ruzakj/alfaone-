package com.ric.alfaone.rebuild

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    private val links = linkedMapOf(
        "Human Capital" to "https://intranet.sat.co.id/humancapital/public/index/mainmenu",
        "RRAK" to "https://intranet.sat.co.id/rrak/public/",
        "BST Online" to "https://intranet.sat.co.id/bst_online/signin",
        "KOPKAR" to "https://intranet.sat.co.id/koperasi/public/",
        "SO Karyawan" to "https://hosokartoko0201.sat.co.id",
        "SO ATM / Tenant" to "https://intranet.sat.co.id/st/public/so/atm"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showMenu()
    }

    private fun showMenu() {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 48, 32, 32)
        }
        root.addView(TextView(this).apply {
            text = "APP INTRANET"
            textSize = 24f
            setPadding(0, 0, 0, 24)
        })
        links.forEach { (name, url) ->
            root.addView(Button(this).apply {
                text = name
                setOnClickListener { openWeb(name, url) }
            })
        }
        setContentView(root)
    }

    private fun openWeb(title: String, url: String) {
        title = title
        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.webViewClient = WebViewClient()
        web.loadUrl(url)
        setContentView(web)
    }
}
