package max.guesswh0o.com.designpatternskotlin.abstract_factory_pattern

/**
 * Created by GuessWh0o on 06.03.2018.
 * Email: developerint97@gmail.com
 */
class VehicleFactory : AbstractFactory() {

    override fun getVehicle(vehicle: String): Vehicle? {
        return when(vehicle) {
            "Car" -> Car()
            "Plane" -> Plane()
            else -> null
        }
    }

    override fun getColor(color: String): Color? = null
}