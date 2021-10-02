package br.senac.aula07examples.tabs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula07examples.R
import br.senac.aula07examples.databinding.ActivityTabBinding
import com.google.android.material.tabs.TabLayoutMediator

class TabActivity : AppCompatActivity() {
    lateinit var binding: ActivityTabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = TabPageAdapter(this)

        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, position ->
            when(position){
                0 -> {
                   // tab.text = "Recentes"
                    tab.icon = getDrawable(R.drawable.history)
                }
                1 -> {
                    //tab.text = "Artistas"
                    tab.icon = getDrawable(R.drawable.person)

                }
                2 -> {
                    //tab.text = "Álbuns"
                    tab.icon = getDrawable(R.drawable.album)
                }
            }
        }.attach()

    }
}