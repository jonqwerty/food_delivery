package com.example.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.fooddelivery.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navigationView = findNavController(R.id.fragment_container)

        bottomNavView.setupWithNavController(navigationView)

//        changeFragment(HomeFragment())

//        binding.bottomNavigationView.setOnItemSelectedListener {
//            when(it.itemId) {
//                R.id.home ->{
//                    changeFragment(HomeFragment())
//                }
//
//                R.id.cart ->{
//                    changeFragment(CartFragment())
//                }
//
//                R.id.search ->{
//                    changeFragment(SearchFragment())
//                }
//
//                R.id.history ->{
//                    changeFragment(HistoryFragment())
//                }
//
//                R.id.profile ->{
//                    changeFragment(ProfileFragment())
//                }
//            }
//            return@setOnItemSelectedListener true
//        }
//    }
//
//    fun changeFragment (fragment:Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.fragment_container, fragment)
//        fragmentTransaction.commit()
//
    }
}