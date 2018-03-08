package max.guesswh0o.com.designpatternskotlin.builder_pattern

/**
 * Created by GuessWh0o on 08.03.2018.
 * Email: developerint97@gmail.com
 */
class VegBurger : Burger() {
    override fun name(): String = "Vegetarian burger"
    override fun price(): Float = 10.0f
}