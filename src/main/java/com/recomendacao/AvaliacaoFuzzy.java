package main.java.com.recomendacao;

public class AvaliacaoFuzzy extends VariavelFuzzyBase {
    @Override
    public void definirPertinencia(double valor) {
        if (valor <= 4) {
            pertinenciaBaixa = 1;
            pertinenciaMedia = 0;
            pertinenciaAlta = 0;
        } else if (valor <= 7) {
            pertinenciaBaixa = (7 - valor) / 3;
            pertinenciaMedia = (valor - 4) / 3;
            pertinenciaAlta = 0;
        } else {
            pertinenciaBaixa = 0;
            pertinenciaMedia = (10 - valor) / 3;
            pertinenciaAlta = (valor - 7) / 3;
        }
    }
}

