package max.guesswh0o.com.designpatternskotlin.singleton_pattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.singleton_layout_pattern.*
import max.guesswh0o.com.designpatternskotlin.R

/**
 * Created by GuessWh0o on 08.03.2018.
 * Email: developerint97@gmail.com
 */
class SingletonPatternActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singleton_layout_pattern)


        btn_get_instance.setOnClickListener({
            SingleObject.textFromObject = "New Text"
            val single = SingleObject
            single.textFromObject = "SINGLETON TEXT"


     //       val oneTwo = SingleObject.textFromObject + "   ${single.textFromObject}"
            textView.text = single.textFromObject
        })
    }
}
