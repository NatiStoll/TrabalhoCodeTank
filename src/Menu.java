package NovaTemperaturaExercicio;

import java.util.Scanner;

public class Menu {

    //criar menu

    public static void apresentarMenu(){

        System.out.println("Digite uma opção:");

        System.out.println("1 Nova Temperatura");
        System.out.println("2 Maior");
        System.out.println("3 Menor");
        System.out.println("4 Media");
        System.out.println("5 Converter");
        System.out.println(" Sair");
    }




    public static void main(String[] args) {

        Scanner keybord = new Scanner(System.in);
        int option;


        System.out.println("Bem Vindo");
        System.out.println("Conversor de temperatura");
        System.out.println("Vamos configurar");


        System.out.println("Quantos numeros quer verificar?");
        int quantidadeDeTemperatura = keybord.nextInt();
        System.out.println("Ok, vamos começar!");

//        Temperatura[] temperaturas = new



        do{
            apresentarMenu();
            option = keybord.nextInt();

            switch (option){
                case 1:
                    System.out.println("Primeira opção");
                    break;
            }

        } while(option != 0);
        System.out.println("Fim do processo");




    }
}
