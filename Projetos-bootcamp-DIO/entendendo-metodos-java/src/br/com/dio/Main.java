package br.com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "";

        // variáveis calculadora
        double num1, num2;
        int operaction;

        //variáveis horas
        int hours;
        int getHours;

        // variáveis empréstimos
        int days = 0;
        double valorLoan = 0;
        double valorFinal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora, Horas ou Emprestimo?");
        name = scan.next();

        switch (name){
            case "Calculadora":
                System.out.println("****** Calculadora ******");
                System.out.println("Entre com dois numeros");

                System.out.printf("Primeiro número: ");
                num1 = scan.nextDouble();
                System.out.printf("Segundo número: ");
                num2 = scan.nextDouble();

                System.out.println("Escolha qual tipo de operação você prefere!");
                System.out.println("1-soma, 2-sutração, 3-multiplicação, 4-divisão");
                operaction = scan.nextInt();

                switch (operaction){
                    case 1:
                        Calculator.sum(num1, num2);
                        break;
                    case 2:
                        Calculator.subtraction(num1, num2);
                        break;
                    case 3:
                        Calculator.multiplie(num1, num2);
                        break;
                    case 4:
                        Calculator.division(num1, num2);
                        break;
                    default:
                        System.out.println("Entre com um tipo de valor válido!!!");
                }
                break;
            case "Horas":
                System.out.println("***** Horas do dia *****");
                System.out.println("Que horas são nesse exato momento? ");
                getHours = scan.nextInt();

                if (getHours >= 0 && getHours < 12){
                    GreetingDay.goodMorning();
                } else if (getHours >= 12 && getHours <18) {
                    GreetingDay.goodAfternoon();
                } else if (getHours >= 18 && getHours <24) {
                    GreetingDay.goodEvening();
                } else {
                    System.out.println("Horario não existente");
                }
                break;
            case "Emprestimo":
                System.out.println("*** Banco Dio - Empréstimo *****");
                System.out.println("Empréstimos abaixo de de 30 dias os juros será menor que acima de de 30 dias.");
                System.out.println("valor desejado: ");
                valorLoan = scan.nextDouble();
                System.out.println("Prentenção de pagamento será para quantos dias a partir e hoje?");
                days = scan.nextInt();

                LoanMoney.calculator(valorLoan, days );
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}