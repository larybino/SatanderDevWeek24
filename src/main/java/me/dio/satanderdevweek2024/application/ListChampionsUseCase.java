package me.dio.satanderdevweek2024.application;

import java.util.List;

import me.dio.satanderdevweek2024.domain.model.Champions;
import me.dio.satanderdevweek2024.domain.ports.ChampionsRepositor;

public record ListChampionsUseCase(ChampionsRepositor repository) {
public List<Champions> findAll() {
        return repository.findAll();
    }
}
