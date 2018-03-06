package max.guesswh0o.com.designpatternskotlin.abstract_factory_pattern

/**
 * Created by GuessWh0o on 06.03.2018.
 * Email: developerint97@gmail.com
 */
class ColorFactory : AbstractFactory() {

    override fun getVehicle(vehicle: String): Vehicle? = null

    override fun getColor(color: String): Color? {
        return when(color) {
            "Red" -> Red()
            "Green" -> Green()
            else -> null
        }
    }
}