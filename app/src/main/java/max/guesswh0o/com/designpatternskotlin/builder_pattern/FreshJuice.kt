package max.guesswh0o.com.designpatternskotlin.builder_pattern

/**
 * Created by GuessWh0o on 08.03.2018.
 * Email: developerint97@gmail.com
 */
class FreshJuice : ColdDrink() {
    override fun name(): String = "Fresh juice"

    override fun price(): Float = 30.0f
}