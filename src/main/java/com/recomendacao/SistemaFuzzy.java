package main.java.com.recomendacao;

public interface SistemaFuzzy {
    double calcularRecomendacao(AvaliacaoFuzzy avaliacao, DuracaoFuzzy duracao, PopularidadeFuzzy popularidade);
}
