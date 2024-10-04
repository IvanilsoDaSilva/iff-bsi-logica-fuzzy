package main.java.com.recomendacao;

public class PopularidadeFuzzy extends VariavelFuzzyBase {
    @Override
    public void definirPertinencia(double valor) {
        if (valor <= 5) {
            pertinenciaBaixa = 1;
            pertinenciaMedia = 0;
            pertinenciaAlta = 0;
        } else if (valor <= 20) {
            pertinenciaBaixa = (20 - valor) / 15;
            pertinenciaMedia = (valor - 5) / 15;
            pertinenciaAlta = 0;
        } else {
            pertinenciaBaixa = 0;
            pertinenciaMedia = (30 - valor) / 10;
            pertinenciaAlta = (valor - 20) / 10;
        }
    }
}
