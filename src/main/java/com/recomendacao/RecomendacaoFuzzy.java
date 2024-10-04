package main.java.com.recomendacao;

public class RecomendacaoFuzzy implements SistemaFuzzy {
    @Override
    public double calcularRecomendacao(AvaliacaoFuzzy avaliacao, DuracaoFuzzy duracao, PopularidadeFuzzy popularidade) {
        double recomendacaoBaixa = Math.max(Math.max(
                        Math.min(avaliacao.getPertinenciaBaixa(), duracao.getPertinenciaAlta()),
                        Math.min(duracao.getPertinenciaAlta(), avaliacao.getPertinenciaBaixa())),
                popularidade.getPertinenciaBaixa());

        double recomendacaoMedia = Math.max(Math.min(avaliacao.getPertinenciaMedia(), duracao.getPertinenciaMedia()),
                popularidade.getPertinenciaMedia());

        double recomendacaoAlta = Math.max(Math.min(avaliacao.getPertinenciaAlta(), popularidade.getPertinenciaAlta()),
                Math.min(duracao.getPertinenciaBaixa(), popularidade.getPertinenciaMedia()));

        return (recomendacaoBaixa * 3 + recomendacaoMedia * 5 + recomendacaoAlta * 8) /
                (recomendacaoBaixa + recomendacaoMedia + recomendacaoAlta);
    }
}

