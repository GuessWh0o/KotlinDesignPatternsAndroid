package max.guesswh0o.com.designpatternskotlin.abstract_factory_pattern

import max.guesswh0o.com.designpatternskotlin.abstract_factory_pattern.Vehicle

/**
 * Created by GuessWh0o on 06.03.2018.
 * Email: developerint97@gmail.com
 */
class Car : Vehicle {
    override fun create(): String {
        return "CREATED CAR"
    }
}