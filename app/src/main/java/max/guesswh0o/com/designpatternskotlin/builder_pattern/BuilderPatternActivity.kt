package max.guesswh0o.com.designpatternskotlin.builder_pattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.ScrollingMovementMethod
import kotlinx.android.synthetic.main.activity_builder_pattern.*
import max.guesswh0o.com.designpatternskotlin.R

/**
 * Created by GuessWh0o on 08.03.2018.
 * Email: developerint97@gmail.com
 */
class BuilderPatternActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder_pattern)

        val mealBuilder = MealBuilder()
        tv_builder.movementMethod = ScrollingMovementMethod()

        btn_veg_meal.setOnClickListener({
            val vegMeal = mealBuilder.prepareVegetarianMeal()
            tv_builder.append(vegMeal.showItems())
        })

        btn_non_veg_meal.setOnClickListener({
            val nonVegMeal = mealBuilder.prepareNonVegetarianMeal()
            tv_builder.append(nonVegMeal.showItems())
        })
    }
}