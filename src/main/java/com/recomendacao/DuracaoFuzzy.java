package main.java.com.recomendacao;

public class DuracaoFuzzy extends VariavelFuzzyBase {
    @Override
    public void definirPertinencia(double valor) {
        if (valor <= 90) {
            pertinenciaBaixa = 1;
            pertinenciaMedia = 0;
            pertinenciaAlta = 0;
        } else if (valor <= 150) {
            pertinenciaBaixa = (150 - valor) / 60;
            pertinenciaMedia = (valor - 90) / 60;
            pertinenciaAlta = 0;
        } else {
            pertinenciaBaixa = 0;
            pertinenciaMedia = (180 - valor) / 30;
            pertinenciaAlta = (valor - 150) / 30;
        }
    }
}
