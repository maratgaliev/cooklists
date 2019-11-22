package models

import play.api.libs.json.Json

case class Recipe(id: Int, photo: String, title: String, ingredients: String, description: String, steps: String, servings: Int, cooktime: Int, hidden: Boolean)

object Recipe {
  implicit val format = Json.format[Recipe]
}