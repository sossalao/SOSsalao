package com.example.sossalao

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
                //Buscar: filtrar elementos de uma lista na tela (veja código no GitHub de aula para ver a implementação). Por enquanto faça apenas a simulação de busca, mostrando o texto inserido no Toast quando estiver digitando e quando finalizar a busca
                R.id.action_search -> Toast.makeText(this@HomeActivity,"Deseja pesquisar algo?", Toast.LENGTH_SHORT).show()
                R.id.action_config -> Toast.makeText(this@HomeActivity,"Deseja configurar algo?", Toast.LENGTH_SHORT).show()
                R.id.action_refresh -> Toast.makeText(this@HomeActivity,"Deseja atualizar algo?", Toast.LENGTH_SHORT).show()
                R.id.action_logout -> Toast.makeText(this@HomeActivity,"Deseja deslogar?", Toast.LENGTH_SHORT).show()
            };   true

        }

    }
}