package br.com.dio.List;

import java.util.*;

public class List1 {
    public static void main(String[] args) {

        //Collections

        System.out.println("Crie uma lista e adiciones as setes notas");

        List<Double> notas = new ArrayList<>();

        notas.add(11d);
        notas.add(0d);
        notas.add(7.5);
        notas.add(2.8);
        notas.add(1d);
        notas.add(10.0);
        notas.add(5.5);

        // mesma forma de impressão
        System.out.println(notas);
        System.out.println(notas.toString());


        System.out.println("Exiba a posição da nota da 2.8, posição: " + notas.indexOf(2.8));
        System.out.println("Adicone na lista a nota 8.0 na posição 4");
        notas.add(3, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 0 pela nota 7.0:");
        // duas maneiras de fazer
        // notas.set(notas.indexOf(0d), 7d)
        notas.set(1, 7.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 1.0 está na lista: " + notas.contains(1.0));
        System.out.println("Exiba todas as notas na ordem em que foram informadas no formato de listas:");

        int index = 1;
        for (Double nota: notas) System.out.println(" Nota " + index++ + ": "+ nota);


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);
        System.out.println("Exiba a menor nota é " + Collections.min(notas));

        System.out.println("Exiba a maior nota é " + Collections.max(notas));
        System.out.println("Exiba a soma dos valores ");
        Iterator<Double> iterator = notas.iterator();
        double somaNotas = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            somaNotas += next;
        }

        System.out.println(somaNotas);
        System.out.println("Exiba a média das notas: " + somaNotas / notas.size());
        System.out.println("Remova a nota 0: ");
        notas.remove(1.0);
        System.out.println(notas);
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next <= 7d) iterator1.remove();
        }

        System.out.println(notas);

        System.out.println("Apague toda a lista");

        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}