package max.guesswh0o.com.designpatternskotlin.abstract_factory_pattern

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_abstract_factory_pattern.*
import max.guesswh0o.com.designpatternskotlin.R

/**
 * Created by GuessWh0o on 06.03.2018.
 * Email: developerint97@gmail.com
 */

class AbstractFactoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_abstract_factory_pattern)

        val vehicleFactory = FactoryProducer.getFactory("Vehicle")
        val colorFactory = FactoryProducer.getFactory("Color")

        btn_car.setOnClickListener({
            tv_abstract.text = vehicleFactory?.getVehicle("Car")?.create()
        })

        btn_plane.setOnClickListener({
            tv_abstract.text = vehicleFactory?.getVehicle("Plane")?.create()
        })

        btn_red.setOnClickListener({
            tv_abstract.setTextColor(Color.parseColor(colorFactory?.getColor("Red")?.fill()))
        })
        btn_green.setOnClickListener({
            tv_abstract.setTextColor(Color.parseColor(colorFactory?.getColor("Green")?.fill()))
        })
    }
}