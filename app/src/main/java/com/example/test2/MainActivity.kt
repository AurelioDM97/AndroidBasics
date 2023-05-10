package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.test2.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit  var binding : ActivityMainBinding
    private lateinit var bottomNavView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNavView = binding.bottomNavigation


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        bottomNavView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    navController.navigate(R.id.homeFragment)
                }
                R.id.notification -> {
                    navController.navigate(R.id.notificationFragment)
                }
                R.id.setting -> {
                    navController.navigate(R.id.settingFragment)
                }

            }
            return@setOnItemSelectedListener true

        }

    }
}




