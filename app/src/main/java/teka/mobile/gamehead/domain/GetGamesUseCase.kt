package teka.mobile.gamehead.domain

import teka.mobile.gamehead.domain.item.GameItem
import teka.mobile.gamehead.repo.GameRepository
import javax.inject.Inject


class GetGamesUseCase @Inject constructor(
    private val gameRepository: GameRepository
    ){

    suspend operator fun invoke(): List<GameItem>{

        return gameRepository.getGames().shuffled()

    }

}