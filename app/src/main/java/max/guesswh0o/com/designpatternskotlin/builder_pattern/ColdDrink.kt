package max.guesswh0o.com.designpatternskotlin.builder_pattern

/**
 * Created by GuessWh0o on 08.03.2018.
 * Email: developerint97@gmail.com
 */
abstract class ColdDrink : Item {
    override fun packing(): Packing = Bottle()

    override abstract fun price(): Float
}