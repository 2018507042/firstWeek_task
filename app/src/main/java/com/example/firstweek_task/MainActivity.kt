package com.example.firstweek_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.firstweek_task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()
    }

    private fun onClick(){
        binding.btnClick.setOnClickListener {
            binding.textView.visibility = View.VISIBLE
            val editText = binding.editText.text
            binding.textView.text = editText

        }
    }
}