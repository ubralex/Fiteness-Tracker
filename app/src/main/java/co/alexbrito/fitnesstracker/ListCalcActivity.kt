package co.alexbrito.fitnesstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import co.alexbrito.fitnesstracker.model.Calc

class ListCalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_calc)

        val type =
            intent?.extras?.getString("type") ?: throw IllegalStateException("type not found")

        Thread {
            val app = application as App
            val dao = app.db.calcDao()
            val response = dao.getRegisterByType(type)

            runOnUiThread {
                Log.i("Teste", "Resposta: $response")
            }
        }.start()
    }
}