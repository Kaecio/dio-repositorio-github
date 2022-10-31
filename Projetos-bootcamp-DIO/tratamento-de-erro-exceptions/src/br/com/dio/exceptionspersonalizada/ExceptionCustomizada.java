package br.com.dio.exceptionspersonalizada;

import javax.swing.*;

public class ExceptionCustomizada {
    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++){
            try {
                if (numerador[i] % 2 != 0) throw new DivisaoNaoExataException("Divisao nao exata", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println("O reultado da divisao entre os números é: " + resultado);
            }catch (DivisaoNaoExataException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Divisao nao exata!Q");
            }

        }
        System.out.println("O Programa continua");
    }
}

