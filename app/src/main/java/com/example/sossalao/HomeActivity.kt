package com.example.sossalao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        action_search.setOnClickListener{
            Toast.makeText(this@HomeActivity, "Deseja pesquisar algo?", Toast.LENGTH_SHORT).show()
        }

        bottomAppBar.replaceMenu(R.menu.menu)

        bottomAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_add -> Toast.makeText(this@HomeActivity,"Deseja adicionar algo?", Toast.LENGTH_SHORT).show()
                R.id.action_config -> Toast.makeText(this@HomeActivity,"Deseja configurar algo?", Toast.LENGTH_SHORT).show()
                R.id.action_refresh -> Toast.makeText(this@HomeActivity,"Deseja atualizar algo?", Toast.LENGTH_SHORT).show()
                R.id.action_logout -> Toast.makeText(this@HomeActivity,"Deseja deslogar?", Toast.LENGTH_SHORT).show()
            };   true

        }

    }
}