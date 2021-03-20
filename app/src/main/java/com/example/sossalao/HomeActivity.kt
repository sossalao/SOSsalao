package com.example.sossalao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        action_add.setOnClickListener{
            Toast.makeText(this@HomeActivity, "Deseja add algo?", Toast.LENGTH_SHORT).show()
        }

        bottom_home.replaceMenu(R.menu.menu)

        bottom_home.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_search -> Toast.makeText(this@HomeActivity,"Deseja pesquisar algo?", Toast.LENGTH_SHORT).show()
                R.id.action_config -> startActivity(Intent(this, SettingsActivity::class.java))
                R.id.action_refresh -> loading()
                R.id.action_logout -> startActivity(Intent(this, LoginActivity::class.java))
            };   true

        }
    }
    private fun loading() {
        R.animator.progressbar.apply {  }
    }
}