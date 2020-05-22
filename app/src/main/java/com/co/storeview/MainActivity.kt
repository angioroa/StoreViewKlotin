package com.co.storeview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.co.storeview.Fragments.MapFragment
import com.co.storeview.Fragments.ProfileFragment
import com.co.storeview.Fragments.SearchFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        var navView = findViewById<NavigationView>(R.id.nav_view)
        drawerLayout = findViewById(R.id.drawer_layout)
        setSupportActionBar(toolbar)


        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.nav_profile -> {
                var profileFragment = ProfileFragment()
                fragmentTransaction.add(R.id.container, profileFragment)
            }
            R.id.nav_mapa -> {
                var mapaFragment = MapFragment()
                fragmentTransaction.add(R.id.container, mapaFragment)
            }
            R.id.nav_search -> {
                var searchFragment = SearchFragment()
                fragmentTransaction.add(R.id.container, searchFragment)
            }
        }
        fragmentTransaction.commit()
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
