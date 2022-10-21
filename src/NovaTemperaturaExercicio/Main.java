package NovaTemperaturaExercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual unidade voce de entrada\n");
        System.out.println("1 - CELSIUS");
        System.out.println("2 - FAHRENHEIT");
        System.out.println("* - KELVIN");
        int unidade = teclado.nextInt();

        UnidadeDeTemperaturaEnum unidadeEnum;
        if (unidade == 1) {
            unidadeEnum = UnidadeDeTemperaturaEnum.CELSIUS;
        } else if (unidade == 2) {
            unidadeEnum = UnidadeDeTemperaturaEnum.FAHRENHEIT;
        } else {
            unidadeEnum = UnidadeDeTemperaturaEnum.KELVIN;
        }

        System.out.println("Para qual unidade voce deseja converter\n");
        System.out.println("1 - CELSIUS");
        System.out.println("2 - FAHRENHEIT");
        System.out.println("* - KELVIN");
        int unidadeAlvo = teclado.nextInt();

        System.out.println("Digite quantas temperaturas quer converter");
        int quantidade = teclado.nextInt();

        while (quantidade > 0) {
            System.out.println("Digite o valor");
            double valor = teclado.nextDouble();
            Temperatura temperatura = new Temperatura(valor, unidadeEnum);
            if (unidadeAlvo == 1) {
                System.out.println("O valor de " + temperatura.getValor() + " em Celsius eh " + temperatura.converte(UnidadeDeTemperaturaEnum.CELSIUS));
            } else if (unidadeAlvo == 2) {
                System.out.println("O valor de " + temperatura.getValor() + " em Fahrenheith eh " + temperatura.converte(UnidadeDeTemperaturaEnum.FAHRENHEIT));
            } else {
                System.out.println("O valor de " + temperatura.getValor() + " em Kelvin eh " + temperatura.converte(UnidadeDeTemperaturaEnum.KELVIN));
            }

            quantidade--;
        }

    }
}
