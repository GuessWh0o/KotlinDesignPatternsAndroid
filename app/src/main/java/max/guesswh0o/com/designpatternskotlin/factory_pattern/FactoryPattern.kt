package max.guesswh0o.com.designpatternskotlin.factory_pattern

/**
 * Created by maxim.malisciuc on 05.03.2018.
 * Copyright CertSign
 * Email: developerint97@gmail.com
 */

interface Vehicle {
    fun fabricate() : String
}

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