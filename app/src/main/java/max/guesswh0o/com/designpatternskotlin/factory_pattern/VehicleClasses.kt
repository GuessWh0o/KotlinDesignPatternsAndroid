package max.guesswh0o.com.designpatternskotlin.factory_pattern

/**
 * Created by GuessWh0o 05.03.2018.
 * Email: developerint97@gmail.com
 */

class Car : Vehicle {
    override fun fabricate() : String {
        return "CREATED CAR"
    }
}

class Plane : Vehicle {
    override fun fabricate(): String {
        return "CREATED PLANE"
    }
}