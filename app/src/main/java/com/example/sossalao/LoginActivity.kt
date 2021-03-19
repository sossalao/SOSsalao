package com.example.sossalao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import java.net.Authenticator

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        password.setOnKeyListener(View.OnKeyListener{ v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP){
                onClickLogin()
            }
            false
        })

        loginBtn.setOnClickListener {onClickLogin() }
    }

    private fun onClickLogin(){
        val intent = Intent(this, HomeActivity::class.java)

        if (loginAuthenticator()){
            Toast.makeText(this, "Bem vindo", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        } else {
            Toast.makeText(this, "Login ou senha inválidos", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loginAuthenticator():Boolean {
        val login = username.text.toString()
        val password = password.text.toString()

        if (login == "aluno" && password == "impacta")
            return true
        return false

    }
}