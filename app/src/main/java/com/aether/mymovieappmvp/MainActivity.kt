package com.aether.mymovieappmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    fun init(){
        val adapter = TabsFragmentAdapter(supportFragmentManager,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        adapter.addItem(MovieMainFragment(),"Movies")
        adapter.addItem(MovieFavoriteFragment(),"Favorites Movies")

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = adapter

        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)
    }

    class TabsFragmentAdapter(fm: FragmentManager, behavior: Int) :
        FragmentPagerAdapter(fm, behavior){

        private val listFragment: MutableList<Fragment> = ArrayList()
        private val titleList: MutableList<String> = ArrayList()

        fun addItem(fragment: Fragment, title:String){
            listFragment.add(fragment)
            titleList.add(title)
        }

        override fun getCount(): Int {
            return listFragment.size
        }

        override fun getItem(position: Int): Fragment {
            return listFragment[position]
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }
    }
}