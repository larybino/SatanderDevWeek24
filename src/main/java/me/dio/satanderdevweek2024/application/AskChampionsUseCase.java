package me.dio.satanderdevweek2024.application;

import me.dio.satanderdevweek2024.domain.ports.ChampionsRepositor;
import me.dio.satanderdevweek2024.domain.exception.ChampionNotFoundException;
import me.dio.satanderdevweek2024.domain.model.Champions;


public record AskChampionsUseCase(ChampionsRepositor repository) {
    public String askChampions(long championId, String question){
        Champions champion= repository.findById(championId)
            .orElseThrow(()-> new ChampionNotFoundException(championId));
        String championContext= champion.generateContextByQuestion(question);
        return championContext;
    }
}