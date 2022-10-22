package br.com.dio;

public class Calculator {

    public static void sum(double number1, double number2){
        double result =  number1 + number2;
        System.out.println("1-soma : " + result);
    }

    public static void subtraction(double number1, double number2){
        double result =  number1 - number2;
        System.out.println("2-subtração : " + result);
    }

    public static void multiplie(double number1, double number2){
        double result =  number1 * number2;
    System.out.println("3-multiplicação : " + result);
    }

    public static void division(double number1, double number2){
        double result =  number1 / number2;
        System.out.println("4-divisão : " + result);
    }
}
