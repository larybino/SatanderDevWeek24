package me.dio.satanderdevweek2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import me.dio.satanderdevweek2024.application.ListChampionsUseCase;
import me.dio.satanderdevweek2024.domain.ports.ChampionsRepositor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepositor repository) {
		return new ListChampionsUseCase(repository);
	}
}
