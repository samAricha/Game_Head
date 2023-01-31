package teka.mobile.gamehead.data.remote

import retrofit2.Response
import retrofit2.http.GET
import teka.mobile.gamehead.data.remote.model.GameModel
import teka.mobile.gamehead.util.Constants.Companion.GAMES_ENDPOINT

interface GameApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>
}

