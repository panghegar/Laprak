package com.example.laprak

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.laprak.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnToast.setOnClickListener {
                // Ambil teks dari EditText untuk username
                val username = usernameEditText.text.toString()

                // Tampilkan toast dengan username
                Toast.makeText(
                    this@MainActivity, "Username: $username",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}