package me.dio.satanderdevweek2024.domain.model;

public record Champions (
    Long id,
    String name,
    String role,
    String lore,
    String imageUrl
){
    public String generateContextByQuestion(String question){
        return """
                Pergunta: %s
                Nome do Campeão: %s
                Função: %S
                Lore(história): %s
                """.formatted(question, this.name, this.role, this.lore );
    }
}
