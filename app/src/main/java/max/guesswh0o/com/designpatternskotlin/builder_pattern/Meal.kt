package max.guesswh0o.com.designpatternskotlin.builder_pattern

/**
 * Created by GuessWh0o on 08.03.2018.
 * Email: developerint97@gmail.com
 */
class Meal {
    private var items = ArrayList<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun getCost() : Float {
        var cost = 0.0f

        for(item in items) {
            cost += item.price()
        }
        return cost
    }

    fun showItems(): String{
        val strbff: StringBuilder = StringBuilder()
        for(item in items) {
            strbff.append("\nItem: ${item.name()} \nPacking: ${item.packing().pack()} \nPrice: ${item.price()}\n")
        }
        return strbff.toString()
    }
}