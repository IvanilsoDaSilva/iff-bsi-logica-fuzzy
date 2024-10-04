package main.java.com.recomendacao;

public abstract class VariavelFuzzyBase implements VariavelFuzzy {
    protected double pertinenciaBaixa;
    protected double pertinenciaMedia;
    protected double pertinenciaAlta;

    @Override
    public double getPertinenciaBaixa() {
        return pertinenciaBaixa;
    }

    @Override
    public double getPertinenciaMedia() {
        return pertinenciaMedia;
    }

    @Override
    public double getPertinenciaAlta() {
        return pertinenciaAlta;
    }
}
