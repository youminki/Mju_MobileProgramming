package com.example.final5ex_catchat

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.final5ex_catchat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        setSupportActionBar(bindingMain.toolbar)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val builder = AppBarConfiguration.Builder(navController.graph)
//        builder.setOpenableLayout(bindingMain.main)
        val appBarConfiguration = builder.build()

//        NavigationUI.setupWithNavController(bindingMain.toolbar, navController, appBarConfiguration)
//        NavigationUI.setupWithNavController(bindingMain.navView, navController)

        bindingMain.toolbar.setupWithNavController(navController, appBarConfiguration)

        NavigationUI.setupWithNavController(bindingMain.bottomNav, navController)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController: NavController =
            Navigation.findNavController(this@MainActivity, R.id.nav_host_fragment)
        NavigationUI.onNavDestinationSelected(item, navController)
        return super.onOptionsItemSelected(item)
    }

//    override fun onBackPressed() {
//        if (bindingMain.main.isDrawerOpen(GravityCompat.START)) {
//            bindingMain.main.closeDrawer(GravityCompat.START)
//        } else {
//            super.onBackPressed()
//        }
//    }
//



}