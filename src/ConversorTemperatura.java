// Criar função seguindo fórmula:
//
//        fahrenheit = (celsius * fator1) + fator2
//        fator1 = 9/5
//        fator2 = 32
//        Tanto fator1 e fator2 de devem ser constantes.
//        celcius deve ser variável um valor variável.
//
//        O seu programa deve calcular o valor em fahrenheit de ao menos duas temperaturas distintas e deve imprimir o resultado no console.

import java.util.Scanner;
public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira temperatura em Celsius: ");
        double celsius1 = sc.nextFloat();
        System.out.println("Digite a segunda temperatura em Celsius: ");
        double celsius2 = sc.nextFloat();
        System.out.printf("A temperatura de %.1fºC em Fahrenheit é: %.1fºF.\n", celsius1, converterCelsiusFahrenheit(celsius1));
        System.out.printf("A temperatura de %.1fºC em Fahrenheit é: %.1fºF.", celsius2, converterCelsiusFahrenheit(celsius2));
    }
    static final double FATOR1 = (double) 9/5;
    static final double FATOR2 = 32;
    static double converterCelsiusFahrenheit(double C){
        return C*FATOR1 + FATOR2;
//        double f = C*FATOR1 + FATOR2;
//        return f;

    }

}
