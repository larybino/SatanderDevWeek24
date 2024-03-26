package me.dio.satanderdevweek2024.domain.ports;

import java.util.List;
import java.util.Optional;

import me.dio.satanderdevweek2024.domain.model.Champions;

public interface ChampionsRepositor {
List<Champions> findAll();

    Optional<Champions> findById(Long id);
}
