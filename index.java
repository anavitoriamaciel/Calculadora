package CalculadoraInt;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        boolean continuar = true;
        Scanner entrada = new Scanner(System.in);
        // mensagem de boas-vindas
        System.out.println("Bem-vindo à Calculadora Inteira!");

        //loop principal
        while (continuar) {
            //exibição do menu para o usuario
            System.out.println("CALCULADORA \n Opções: \n 1 - ADIÇÃO(+) \n 2 - SUBTRAÇÃO(-) \n 3 - MULTIPLICAÇÃO(x) \n 4 - DIVISÃO (÷) \n 5 - MODULO(%) \n 6 - SAIR");
            System.out.print("Digite a opção que você deseja: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();
            //verificando se o usuario quer finalizar a calculadora
            if (opcao == 6) {
                continuar = false;
                System.out.println("Finalizando calculadora");
                break; //sair do loop
            }

            int num1, num2;
            System.out.print("Digite um número inteiro: ");
            while (!entrada.hasNextInt()) {
                System.out.println("Erro: entrada inválida. Por favor, digite um número inteiro.");
                entrada.next(); // descartar a entrada inválida
                System.out.print("Digite um número inteiro: ");
            }
            num1 = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Digite o segundo número inteiro: ");
            while (!entrada.hasNextInt()) {
                System.out.println("Erro: entrada inválida. Por favor, digite um número inteiro.");
                entrada.next(); // descartar a entrada inválida
                System.out.print("Digite o segundo número inteiro: ");
            }
            num2 = entrada.nextInt();
            entrada.nextLine();
            //verificando qual operação realizar
            switch (opcao) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("ERRO!");
                    } else {
                        System.out.println(num1 + " ÷ " + num2 + " = " + ((double)num1 / (double)num2));
                    }
                    break;
                case 5:
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("ERRO!");
                    } else {
                        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }


    }

}

