package me.dio.satanderdevweek2024.domain.exception;

public class ChampionNotFoundException extends RuntimeException{
    public ChampionNotFoundException(long championId) {

        super("Champion %d not found.".formatted(championId));

    }

        
    }

