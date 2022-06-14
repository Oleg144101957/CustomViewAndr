package com.vishnevskiypro.customviewandr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.vishnevskiypro.customviewandr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        with(binding.bottomButtons){
            positiveButton.text = getString(R.string.btn_ok)
            negativeButton.text = getString(R.string.btn_cancel)

            positiveButton.setOnClickListener {
                progress.visibility = View.VISIBLE
                positiveButton.visibility = View.INVISIBLE
                negativeButton.visibility = View.INVISIBLE
            }
        }


    }
}