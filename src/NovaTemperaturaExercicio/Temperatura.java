package NovaTemperaturaExercicio;

import java.util.InputMismatchException;

public class Temperatura {

    public double valor;
    public UnidadeDeTemperaturaEnum unidadeDeTemperatura;

    public Temperatura(double valor, UnidadeDeTemperaturaEnum unidadeDeTemperatura) {
        this.valor = valor;
        this.unidadeDeTemperatura = unidadeDeTemperatura;
    }

    //funcao
    public double converte(UnidadeDeTemperaturaEnum unidadeAlvo) {
        switch (unidadeDeTemperatura){
            case KELVIN:
                if(unidadeAlvo.equals(UnidadeDeTemperaturaEnum.CELSIUS)) {
                    return converterKelvinEmCelcius(valor);
                } else if (unidadeAlvo.equals(UnidadeDeTemperaturaEnum.FAHRENHEIT)) {
                    return converterKelvinsEmFahrenheit(valor);
                }
                break;
            case CELSIUS:
                if (unidadeAlvo.equals(UnidadeDeTemperaturaEnum.KELVIN)) {
                    return converterCelsiusEmKelvin(valor);
                } else if (unidadeAlvo.equals(UnidadeDeTemperaturaEnum.FAHRENHEIT)){
                    return converterCelsiusEmFahrenheit(valor);
                }
                break;
            case FAHRENHEIT:
                if (unidadeAlvo.equals(UnidadeDeTemperaturaEnum.CELSIUS)) {
                    return converterFahrenheitEmCelsius(valor);
                } else if (unidadeAlvo.equals(UnidadeDeTemperaturaEnum.KELVIN)){
                    return converterFahrenheitEmKelvin(valor);
                }
                break;
        }
        return valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public UnidadeDeTemperaturaEnum getUnidadeDeTemperatura() {
        return unidadeDeTemperatura;
    }

    public void setUnidadeDeTemperatura(UnidadeDeTemperaturaEnum unidadeDeTemperatura) {
        this.unidadeDeTemperatura = unidadeDeTemperatura;
    }

    static final double FATOR1 = (double) 9/5;
    static final double FATOR2 = 32;
    static final double FATOR3 = 273;

    static final double FATOR4 = (double) 5/9;

    private double converterCelsiusEmFahrenheit(double c){
        double f = c * FATOR1 + FATOR2;
        return f;
    }

    private double converterFahrenheitEmCelsius(double f){
        double c = (f - FATOR2) / FATOR1;
        return c;
    }

    private double converterFahrenheitEmKelvin(double f){
        double k = (f - FATOR2) * FATOR4 + FATOR3;
        return k;
    }

    private double converterCelsiusEmKelvin(double c){
        double k = c + FATOR3;
        return k;
    }

    private double converterKelvinEmCelcius(double k){
        double c = k - FATOR3;
        return c;
    }

    private double converterKelvinsEmFahrenheit(double k){
        double f = (k - FATOR3) * FATOR1 + FATOR2;
        return f;
    }






}
