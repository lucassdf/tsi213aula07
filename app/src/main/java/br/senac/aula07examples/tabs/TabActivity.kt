package br.senac.aula07examples.tabs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula07examples.databinding.ActivityTabBinding

class TabActivity : AppCompatActivity() {
    lateinit var binding: ActivityTabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}