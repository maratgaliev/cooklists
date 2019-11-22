package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.libs.json.Json
import repositories.DataRepository

@Singleton
class ApiController @Inject()(cc: ControllerComponents, dataRepository: DataRepository)
  extends AbstractController(cc) {

  def ping = Action { implicit request =>
    Ok("success")
  }

  def getRecipe(recipeId: Int) = Action { implicit request =>
    dataRepository.getRecipe(recipeId) map { recipe =>
      Ok(Json.toJson(recipe))
    } getOrElse NotFound
  }
}