package br.com.dio.exercicioList;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas a média semestral das tempreraturas
e mostre todas as temperaturas acima desta média, e em que mês estas ocorreram (mostrar o mês
por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TemperaturaMedia {

    public static void main(String[] args) {

        System.out.println("***** Previsão do tempo *****");

        List<Mes> meses = new ArrayList<>(){{
            add( new Mes("Janeiro", 15d, 30.5));
            add( new Mes("Fevereiro", 22.4, 38.2));
            add( new Mes("Março", 20d, 39.9));
            add( new Mes("Abril", 18.7, 34d));
            add( new Mes("Maio", 10.5, 35d));
            add( new Mes("Junho", 07d, 25d));
        }};

       int index = 1;
       for (Mes mes: meses){
           System.out.println(index++ + "" + mes);
       }
        System.out.println("");
        Double valorMedia1 = (meses.get(0).getTemperaturaMinima() + meses.get(0).getTemperaturaMaxima()) / 2;
        System.out.println("Temperatura média para o mês de Janeiro: " +  valorMedia1);
       Double valorMedia = (meses.get(1).getTemperaturaMinima() + meses.get(1).getTemperaturaMaxima()) / 2;
        System.out.println("Temperatura média para o mês de Feveiro: " +  valorMedia);
    }
}

class Mes{
    private String mes;
    private Double temperaturaMinima;
    private Double temperaturaMaxima;

    public Mes(String mes, Double temperaturaMinima, Double temperaturaMaxima) {
        this.mes = mes;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public Double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    @Override
    public String toString() {
        return " - " +
                "" + mes +
                ": Temperatura mínima = " + temperaturaMinima +
                ", Temperatura máxima = " + temperaturaMaxima;
    }
}