package max.guesswh0o.com.designpatternskotlin.builder_pattern

/**
 * Created by GuessWh0o on 08.03.2018.
 * Email: developerint97@gmail.com
 */
class Cola : ColdDrink() {
    override fun name(): String = "Cola"

    override fun price(): Float = 5.0f
}