package barutaso.searchreiwayear

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import barutaso.searchreiwayear.R
import barutaso.searchreiwayear.R.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        getYearButton.setOnClickListener {
            //            Log.v("MainActivity", "Button Click")
            val results = arrayOf(
                "平成元年",
                "平成２年",
                "平成３年",
                "平成４年",
                "平成５年",
                "平成６年",
                "平成７年",
                "平成８年",
                "平成９年",
                "平成１０年",
                "平成１１年",
                "平成１２年",
                "平成１３年",
                "平成１４年",
                "平成１５年",
                "平成１６年",
                "平成１７年",
                "平成１８年",
                "平成１９年",
                "平成２０年",
                "平成２１年",
                "平成２２年",
                "平成２３年",
                "平成２４年",
                "平成２５年",
                "平成２６年",
                "平成２７年",
                "平成２８年",
                "平成２９年",
                "平成３０年",
                "平成３１年",
                "令和元年"
            )
            val count = results.count()
            val n = Random().nextInt(count)

            if (n == count - 1)
                resultTextView.setTextColor(Color.argb(255,255,0,0))
            else
                resultTextView.setTextColor(Color.parseColor("#808080"))

            resultTextView.text = results.get(n)
        }
    }
}
