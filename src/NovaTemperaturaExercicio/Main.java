package NovaTemperaturaExercicio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Pegar temperatura de entrada

        Scanner teclado = new Scanner(System.in);

        System.out.println("__________________________________________");
        System.out.println("");
        System.out.println("Escolha a unidade de origem\n");
        System.out.println("1 - CELSIUS");
        System.out.println("2 - FAHRENHEIT");
        System.out.println("3 - KELVIN");

        //Tratar erro
        //int unidade = teclado.nextInt();

        int unidade;
        try {
            unidade = teclado.nextInt();
        } catch (Exception exception)   {
            System.out.println("Valor digitado inválido. Terminando a aplicação");
            return;
        }




        String unidadeString;

        UnidadeDeTemperaturaEnum unidadeEnum;
        if (unidade == 1) {
            unidadeEnum = UnidadeDeTemperaturaEnum.CELSIUS;
            unidadeString = "ºC";
        } else if (unidade == 2) {
            unidadeEnum = UnidadeDeTemperaturaEnum.FAHRENHEIT;
            unidadeString = "ºF";
        } else if (unidade == 3){
            unidadeEnum = UnidadeDeTemperaturaEnum.KELVIN;
            unidadeString = "K";
        } else {
            System.out.println("Opção digitada inválida.");
            return;
        }



        //Pegar saidas
        System.out.println("__________________________________________");
        System.out.println("");
        System.out.println("Escolha a unidade a ser convertida\n");
        System.out.println("1 - CELSIUS");
        System.out.println("2 - FAHRENHEIT");
        System.out.println("3 - KELVIN");

        //tratar erro
        //int unidadeAlvo = teclado.nextInt();

        int unidadeAlvo;

        try {
            unidadeAlvo = teclado.nextInt();
        } catch (Exception exception)   {
            System.out.println("Opção digitada inválida. Terminando a aplicação.");
            return;
        }

        if (unidadeAlvo < 1 || unidadeAlvo > 3) {
            System.out.println("Opção digitada inválida. Terminando a aplicação.");
            return;
        }


        System.out.println("__________________________________________");
        System.out.println("");
        System.out.println("Digite quantas temperaturas quer converter");

        //tratar erro

        //int quantidade = teclado.nextInt();

        int quantidade;

        try {
            quantidade = teclado.nextInt();
        } catch (Exception exception)   {
            System.out.println("Valor digitado inválido. Terminando a aplicação.");
            return;
        }


        //média colocar em array ou criar variável

        int quantidadeTotal = quantidade;

        double mediaEntrada = 0;
        double mediaSaida = 0;

        while (quantidade > 0) {
            System.out.println("Digite o valor");
            double valor = teclado.nextDouble();
            double saida;

            Temperatura temperatura = new Temperatura(valor, unidadeEnum);
            if (unidadeAlvo == 1) {
                saida = temperatura.converte(UnidadeDeTemperaturaEnum.CELSIUS);
                System.out.println("O valor de " + temperatura.getValor() + unidadeString +" em Celsius é " + saida + "ºC");
            } else if (unidadeAlvo == 2) {
                saida = temperatura.converte(UnidadeDeTemperaturaEnum.FAHRENHEIT);
                System.out.println("O valor de " + temperatura.getValor() + unidadeString +" em Fahrenheith eh " + saida + "ºF");
            } else if (unidadeAlvo == 3) {
                saida = temperatura.converte(UnidadeDeTemperaturaEnum.KELVIN);
                System.out.println("O valor de " + temperatura.getValor() + unidadeString +" em Kelvin eh " + saida + "K");
            } else {
                System.out.println("Opção digitada inválida");
                return;
            }



            mediaEntrada += valor/ quantidadeTotal;
            mediaSaida += saida/quantidadeTotal;
            quantidade--;
        }


        System.out.println("");
        System.out.println("A média dos valores de entrada é: " + mediaEntrada + unidadeString);
        System.out.println("A média dos valores transformados é: " + mediaSaida + unidadeString);

    }
}


