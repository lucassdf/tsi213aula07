package br.senac.aula07examples.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.senac.aula07examples.fragments.AlbumsFragment
import br.senac.aula07examples.fragments.ArtistsFragment
import br.senac.aula07examples.fragments.RecentsFragment

private const val NUM_PAGES = 3

class TabPageAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {

    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
         1 -> ArtistsFragment.newInstance()
         2 -> AlbumsFragment.newInstance()
         else -> RecentsFragment.newInstance()
        }
    }


}