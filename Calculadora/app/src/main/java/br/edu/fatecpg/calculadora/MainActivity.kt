package br.edu.fatecpg.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val calc_campo1 = findViewById<EditText> (R.id.calc_campo1)
        val calc_campo2 = findViewById<EditText> (R.id.calc_campo2)
        val calc_soma = findViewById<Button> (R.id.calc_soma)
        val calc_subtracao = findViewById<Button> (R.id.calc_subtracao)
        val calc_multi = findViewById<Button> (R.id.calc_multi)
        val calc_divisao = findViewById<Button> (R.id.calc_divisao)

        calc_soma.setOnClickListener {
            if (calc_campo1.text.toString().isEmpty() || calc_campo2.text.toString().isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
            else {
                val num1 = calc_campo1.text.toString().toDouble()
                val num2 = calc_campo2.text.toString().toDouble()
                val calc = num1 + num2

                Toast.makeText(this, "O Resultado é $calc", Toast.LENGTH_SHORT).show()
            }
        }
        calc_subtracao.setOnClickListener {
            if (calc_campo1.text.toString().isEmpty() || calc_campo2.text.toString().isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
            else {
                val num1 = calc_campo1.text.toString().toDouble()
                val num2 = calc_campo2.text.toString().toDouble()
                val calc = num1 - num2

                Toast.makeText(this, "O Resultado é $calc", Toast.LENGTH_SHORT).show()
            }
        }
        calc_multi.setOnClickListener {
            if (calc_campo1.text.toString().isEmpty() || calc_campo2.text.toString().isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
            else {
                val num1 = calc_campo1.text.toString().toDouble()
                val num2 = calc_campo2.text.toString().toDouble()
                val calc = num1 * num2

                Toast.makeText(this, "O Resultado é $calc", Toast.LENGTH_SHORT).show()
            }
        }
        calc_divisao.setOnClickListener{
            if (calc_campo1.text.toString().isEmpty() || calc_campo2.text.toString().isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
            else {
                val num1 = calc_campo1.text.toString().toDouble()
                val num2 = calc_campo2.text.toString().toDouble()
                val calc = num1 / num2

                Toast.makeText(this, "O Resultado é $calc", Toast.LENGTH_SHORT).show()
            }
        }


    }
}