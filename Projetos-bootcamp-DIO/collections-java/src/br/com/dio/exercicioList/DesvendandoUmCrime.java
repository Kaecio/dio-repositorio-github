package br.com.dio.exercicioList;

/*
Ultilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da Vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou para a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificada como "Inocente".
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesvendandoUmCrime {
    public static void main(String[] args) {

        String resp, nome;
        String perguntas [] = {"Você telefonou para a vítima?", "Você esteve no local do crime?", "Você mora perto da Vítima?", "Você devia para a vítima?", "Você já trabalhou para a vítima?"};

        Scanner scan = new Scanner(System.in);
        List<String> questionario = new ArrayList<>();
        System.out.println("***** Desvendando um crime *****");
        System.out.println("Vamos fazer umas perguntinhas a respeito de um crime. Para começar, qual o seu nome? ");
        nome = scan.next();
        try {
            for (String pergunta: perguntas) {
                System.out.println("Sr " + nome+", "+pergunta);
                resp = scan.next();
                questionario.add(resp);
            }
        }catch (Exception e){

        }

        if(Collections.frequency(questionario, "sim") >= 1 && Collections.frequency(questionario, "sim") <=2 ){
            System.out.println("Suspeito");
        } else if (Collections.frequency(questionario, "sim") >2 && Collections.frequency(questionario, "sim") <=4 ) {
            System.out.println("Cúmplice");
        }else if (Collections.frequency(questionario, "sim") == 5){
            System.out.println("Assassino");
        }else {
            System.out.println("Inocente");
        }
        System.out.println(Collections.frequency(questionario, "não"));
    }
}
