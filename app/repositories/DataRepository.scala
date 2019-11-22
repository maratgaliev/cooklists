package repositories

import javax.inject.Singleton
import models.{Recipe}

@Singleton
class DataRepository {

  private val recipes = Seq(
    Recipe(1, "pie.png", "Tatar pie", "", "Cool pie", "", 2, 30, false),
    Recipe(1, "tea.png", "Tatar tea", "", "Awesome tea", "", 4, 10, false)
  )

  def getRecipe(recipeId: Int): Option[Recipe] = recipes.collectFirst {
    case p if p.id == recipeId => p
  }
}
