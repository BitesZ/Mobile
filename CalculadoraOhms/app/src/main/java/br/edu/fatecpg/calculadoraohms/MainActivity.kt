package br.edu.fatecpg.calculadoraohms

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val ohm_campo1 = findViewById<EditText>(R.id.ohm_campo1)
        val ohm_campo2 = findViewById<EditText>(R.id.ohm_campo2)
        val ohm_calc = findViewById<Button>(R.id.ohm_calc)
        val ohm_v = findViewById<Button>(R.id.ohm_v)
        val ohm_r = findViewById<Button>(R.id.ohm_r)
        val ohm_i = findViewById<Button>(R.id.ohm_i)
        val ohm_form = findViewById<TextView>(R.id.ohm_form)
        var calc: Int = 1

        ohm_v.setOnClickListener{
            calc = 1

            ohm_form.text = "Fórmula: V = I * R"
            ohm_campo1.hint = "R"
            ohm_campo2.hint = "I"
            ohm_calc.setText("Calcular Voltagem")
        }
        ohm_r.setOnClickListener {
            calc = 2

            ohm_form.text = "Fórmula: R = V / I"
            ohm_campo1.hint = "V"
            ohm_campo2.hint = "I"
            ohm_calc.setText("Calcular Resistência")
        }
        ohm_i.setOnClickListener {
            calc = 3

            ohm_form.text = "Fórmula: I = V / R"
            ohm_campo1.hint = "V"
            ohm_campo2.hint = "R"
            ohm_calc.setText("Calcular Corrente")
        }
        ohm_calc.setOnClickListener {
            val num1 = ohm_campo1.text.toString().toDouble()
            val num2 = ohm_campo2.text.toString().toDouble()

            if (calc == 1) {
                val resultado = num1 * num2
                Toast.makeText(this, "A Voltagem é $resultado", Toast.LENGTH_SHORT).show()
            }
            else if (calc == 2) {
                val resultado = num1 / num2
                Toast.makeText(this, "A Resistência é $resultado", Toast.LENGTH_SHORT).show()
            }
            else if (calc == 3) {
                val resultado = num1 / num2
                Toast.makeText(this, "A Corrente é $resultado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}