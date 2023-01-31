package teka.mobile.gamehead.repo

import teka.mobile.gamehead.data.remote.GameService
import teka.mobile.gamehead.domain.item.GameItem
import teka.mobile.gamehead.domain.item.toGameItem
import javax.inject.Inject


class GameRepository @Inject constructor(
    private val gameService: GameService
){

    suspend fun getGames(): List<GameItem>{

        return gameService.getGames().map {
            it.toGameItem()
        }
    }
}