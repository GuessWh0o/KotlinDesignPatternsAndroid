package max.guesswh0o.com.designpatternskotlin.builder_pattern

/**
 * Created by GuessWh0o on 08.03.2018.
 * Email: developerint97@gmail.com
 */
abstract class Burger : Item {

    override fun packing(): Packing = Wrapper()

    override abstract fun price(): Float
}