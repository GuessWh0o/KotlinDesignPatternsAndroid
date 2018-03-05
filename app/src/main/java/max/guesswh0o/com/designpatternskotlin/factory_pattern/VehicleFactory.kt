package max.guesswh0o.com.designpatternskotlin.factory_pattern
import max.guesswh0o.com.designpatternskotlin.factory_pattern.Vehicle

/**
 * Created by GuessWh0o 05.03.2018.
 * Email: developerint97@gmail.com
 */
class VehicleFactory {
    fun getVehicle(vehicleType : String) : Vehicle? {
        return when(vehicleType) {
            "Car" -> Car()
            "Plane" -> Plane()
            else -> null
        }
    }
}