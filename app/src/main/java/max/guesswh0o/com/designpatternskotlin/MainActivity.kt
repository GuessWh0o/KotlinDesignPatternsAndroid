package max.guesswh0o.com.designpatternskotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import max.guesswh0o.com.designpatternskotlin.factory_pattern.FactoryPatternActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_factory.setOnClickListener({
            startActivity(Intent(this, FactoryPatternActivity::class.java))
        })
    }
}
