package test.java.com.recomendacao;

import main.java.com.recomendacao.AvaliacaoFuzzy;
import main.java.com.recomendacao.DuracaoFuzzy;
import main.java.com.recomendacao.PopularidadeFuzzy;
import main.java.com.recomendacao.RecomendacaoFuzzy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecomendacaoFuzzyTest {

    @Test
    public void testRecomendacaoAlta() {
        AvaliacaoFuzzy avaliacao = new AvaliacaoFuzzy();
        avaliacao.definirPertinencia(9);

        DuracaoFuzzy duracao = new DuracaoFuzzy();
        duracao.definirPertinencia(80);

        PopularidadeFuzzy popularidade = new PopularidadeFuzzy();
        popularidade.definirPertinencia(25);

        RecomendacaoFuzzy sistema = new RecomendacaoFuzzy();
        double recomendacao = sistema.calcularRecomendacao(avaliacao, duracao, popularidade);

        assertTrue(recomendacao > 7, "A recomendação deve ser alta.");
    }

    @Test
    public void testRecomendacaoBaixa() {
        AvaliacaoFuzzy avaliacao = new AvaliacaoFuzzy();
        avaliacao.definirPertinencia(3);

        DuracaoFuzzy duracao = new DuracaoFuzzy();
        duracao.definirPertinencia(160);

        PopularidadeFuzzy popularidade = new PopularidadeFuzzy();
        popularidade.definirPertinencia(2);

        RecomendacaoFuzzy sistema = new RecomendacaoFuzzy();
        double recomendacao = sistema.calcularRecomendacao(avaliacao, duracao, popularidade);

        assertTrue(recomendacao < 4, "A recomendação deve ser baixa.");
    }

    @Test
    public void testRecomendacaoModeradaComDiferentesAvaliacoes() {
        AvaliacaoFuzzy avaliacao = new AvaliacaoFuzzy();
        avaliacao.definirPertinencia(5); // Avaliação média

        DuracaoFuzzy duracao = new DuracaoFuzzy();
        duracao.definirPertinencia(120); // Duração média

        PopularidadeFuzzy popularidade = new PopularidadeFuzzy();
        popularidade.definirPertinencia(15); // Popularidade moderada

        RecomendacaoFuzzy sistema = new RecomendacaoFuzzy();
        double recomendacao = sistema.calcularRecomendacao(avaliacao, duracao, popularidade);

        assertTrue(recomendacao >= 4 && recomendacao <= 7, "A recomendação deve ser moderada.");
    }

    @Test
    public void testRecomendacaoAltaComDuracaoCurtaPopularidadeModerada() {
        AvaliacaoFuzzy avaliacao = new AvaliacaoFuzzy();
        avaliacao.definirPertinencia(8); // Avaliação alta

        DuracaoFuzzy duracao = new DuracaoFuzzy();
        duracao.definirPertinencia(85); // Duração curta

        PopularidadeFuzzy popularidade = new PopularidadeFuzzy();
        popularidade.definirPertinencia(18); // Popularidade moderada

        RecomendacaoFuzzy sistema = new RecomendacaoFuzzy();
        double recomendacao = sistema.calcularRecomendacao(avaliacao, duracao, popularidade);

        assertTrue(recomendacao > 7, "A recomendação deve ser alta.");
    }

    @Test
    public void testRecomendacaoBaixaComPopularidadeAltaDuracaoLonga() {
        AvaliacaoFuzzy avaliacao = new AvaliacaoFuzzy();
        avaliacao.definirPertinencia(3); // Avaliação baixa

        DuracaoFuzzy duracao = new DuracaoFuzzy();
        duracao.definirPertinencia(170); // Duração longa

        PopularidadeFuzzy popularidade = new PopularidadeFuzzy();
        popularidade.definirPertinencia(21); // Popularidade alta

        RecomendacaoFuzzy sistema = new RecomendacaoFuzzy();
        double recomendacao = sistema.calcularRecomendacao(avaliacao, duracao, popularidade);

        assertTrue(recomendacao < 4, "A recomendação deve ser baixa mesmo com popularidade alta.");
    }

    @Test
    public void testRecomendacaoModeradaComAvaliacoesEPopularidadeBaixas() {
        AvaliacaoFuzzy avaliacao = new AvaliacaoFuzzy();
        avaliacao.definirPertinencia(4); // Avaliação baixa-média

        DuracaoFuzzy duracao = new DuracaoFuzzy();
        duracao.definirPertinencia(90); // Duração média

        PopularidadeFuzzy popularidade = new PopularidadeFuzzy();
        popularidade.definirPertinencia(4); // Popularidade baixa

        RecomendacaoFuzzy sistema = new RecomendacaoFuzzy();
        double recomendacao = sistema.calcularRecomendacao(avaliacao, duracao, popularidade);

        assertTrue(recomendacao >= 4 && recomendacao <= 7, "A recomendação deve ser moderada.");
    }
}
