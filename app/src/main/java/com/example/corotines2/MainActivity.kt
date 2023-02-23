package com.example.corotines2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.corotines2.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private var myNumber = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.butto1.setOnClickListener {
            runBlocking {

                value()
            }
        }
    }

            suspend fun value() {
                delay(2000)
                val number = binding.editTextTextPersonName.text.toString().toInt()
                val result = number +  myNumber
                myNumber++
                binding.changer.text = result.toString()

            }
    }

