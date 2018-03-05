package max.guesswh0o.com.designpatternskotlin.factory_pattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_factory_pattern.*
import max.guesswh0o.com.designpatternskotlin.R

/**
 * Created by GuessWh0o 05.03.2018.
 * Email: developerint97@gmail.com
 */
class FactoryPatternActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_factory_pattern)

        val vehicleFactory = VehicleFactory()

        btn_car.setOnClickListener({
            textView.text = vehicleFactory.getVehicle("Car")?.fabricate()
        })

        btn_plane.setOnClickListener({
            textView.text = vehicleFactory.getVehicle("Plane")?.fabricate()
        })
    }
}