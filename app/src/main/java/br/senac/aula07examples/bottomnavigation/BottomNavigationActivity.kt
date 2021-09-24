package br.senac.aula07examples.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula07examples.databinding.ActivityBottomNavigationBinding

class BottomNavigationActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}