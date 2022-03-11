package tw.edu.pu.gm.o1093001.hellokyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv:TextView =
            findViewById<TextView>(R.id.txv)
        txv.text = "Hello Kyle"

    }
}