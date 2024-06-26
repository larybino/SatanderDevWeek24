package me.dio.satanderdevweek2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import me.dio.satanderdevweek2024.application.AskChampionsUseCase;
import me.dio.satanderdevweek2024.application.ListChampionsUseCase;
import me.dio.satanderdevweek2024.domain.ports.ChampionsRepositor;
import me.dio.satanderdevweek2024.domain.ports.GenerativeAiService;



@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepositor repository) {
		return new ListChampionsUseCase(repository);
	}
	@Bean
	public AskChampionsUseCase provideAskChampionsUseCase(ChampionsRepositor repository, GenerativeAiService genAiService) {
		return new AskChampionsUseCase(repository, genAiService);
	}
}
