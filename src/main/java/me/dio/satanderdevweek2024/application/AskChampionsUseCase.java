package me.dio.satanderdevweek2024.application;

import me.dio.satanderdevweek2024.domain.ports.ChampionsRepositor;
import me.dio.satanderdevweek2024.domain.exception.ChampionNotFoundException;
import me.dio.satanderdevweek2024.domain.model.Champions;
import me.dio.satanderdevweek2024.domain.ports.GenerativeAiService;



public record AskChampionsUseCase(ChampionsRepositor repository, GenerativeAiService genAiService) {
    public String askChampions(long championId, String question){
        Champions champion= repository.findById(championId)
            .orElseThrow(()-> new ChampionNotFoundException(championId));
       
            String context = champion.generateContextByQuestion(question);
            String objective = """
                    Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).
                    Responsa perguntas incorporando a personalidade e estilo de um determinado Campeão.
                    Segue a pergunta, o nome do Campeão e sua respectiva lore (história):
                    
                    """;
    
            return genAiService.generateContent(objective, context);
    }
}