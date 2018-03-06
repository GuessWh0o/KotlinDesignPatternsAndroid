package max.guesswh0o.com.designpatternskotlin.abstract_factory_pattern

/**
 * Created by GuessWh0o on 06.03.2018.
 * Email: developerint97@gmail.com
 */
class FactoryProducer {
    companion object {
        fun getFactory(choice: String) : AbstractFactory? {
            when(choice) {
                "Vehicle" -> return VehicleFactory()
                "Color" -> return ColorFactory()
            }
            return null
        }
    }

}