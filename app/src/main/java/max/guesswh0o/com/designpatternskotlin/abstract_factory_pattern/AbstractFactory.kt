package max.guesswh0o.com.designpatternskotlin.abstract_factory_pattern

/**
 * Created by GuessWh0o on 06.03.2018.
 * Email: developerint97@gmail.com
 */
abstract class AbstractFactory {
    abstract fun getVehicle(vehicle:String): Vehicle?
    abstract fun getColor(color:String): Color?
}