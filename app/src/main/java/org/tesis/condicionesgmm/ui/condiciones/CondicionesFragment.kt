package org.tesis.condicionesgmm.ui.condiciones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import org.tesis.condicionesgmm.R

class CondicionesFragment : Fragment() {

    private lateinit var condicionesViewModel: CondicionesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        condicionesViewModel =
            ViewModelProviders.of(this).get(CondicionesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_condiciones, container, false)
        val webview: WebView = root.findViewById(R.id.webview)
        webview.loadUrl("file:///android_asset/index.html")

        return root
    }
}