package main.java.com.recomendacao;

public interface VariavelFuzzy {
    void definirPertinencia(double valor);
    double getPertinenciaBaixa();
    double getPertinenciaMedia();
    double getPertinenciaAlta();
}
