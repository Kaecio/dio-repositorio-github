package br.com.dio.exceptions;

import javax.swing.*;

public class UnckekedException {


    public static void main(String[] args) {

        boolean continueLoop = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador ");
            String b = JOptionPane.showInputDialog("Denominador ");

            try {
                int result = dividir(Integer.parseInt(a) , Integer.parseInt(b));
                System.out.println("Resultado: " + result);
                continueLoop = false;
            }catch (NumberFormatException e){
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada enválida, informe um numero inteiro" + e.getMessage());
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Numerop nao pode ser divido por zero" + e.getMessage());
            }finally {
                System.out.println("Chegou no finally!");
            }

        }while (continueLoop);

        System.out.println("Chegou até aqui .......");
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}