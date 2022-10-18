package br.com.dio;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // tipos de dados

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; o tamanho está acima do valor do shot

        // int i1 = -100000000000; o tamanho está acima do valor do inteiro
        int i2 = 20500;

        long l1 = 10000000000000000L;
        long l2 = 200400000230000002L;

        float f1 = 4.5f;
        float f2 = 99.333f;

        double d1 = 88.99;
        double d2 = 99.090;

        char c1 = 'w';
        //char c2 = 'Tw'; o valor nao corresponde a uma caractere
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cilclan";
        String st3 = "Uma frase grande cabe aqui";

        String dt1 = "01/09/1990";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st1);
        System.out.println(st3);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);

        // operadores aritimeticos

        System.out.println();
        prePos();
        System.out.println();
        aritmetica();
        System.out.println();
        atribuicao();
        System.out.println();
        precedencia();
    }

    private static void prePos(){
        int k = 10;
        int i = ++k;
        int j = k;
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }

    private static void aritmetica(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d + b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a + b: " + r1);
        System.out.println("c - a: " + r2);
        System.out.println("d + b: " + r3);
        System.out.println("e / a: " + r4);
        System.out.println("c % b: " + r5);
    }

    private static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " + d);

        i += 5; // i = i + 5
        j -= 3;
        d /=2.7d;
        l *=3;
        k %=2;

        System.out.println("i: " + i );
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;
        System.out.println("k: " + k);
        System.out.println("i: " + i);
    }

    private static void precedencia(){
         int i = 10;
         int j = 20;
         int k = 30;

         int a = i++ + --j * k;// 10 + 19 * 30 -> 10 + 570 -> 580
        System.out.println("i++ + --j * k" + a);

        System.out.println("i: " + i); //11

        int b = k / --i % 3 +1; //30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 +1: " + b);

        System.out.println("i: " + i); //10

        int c = 2;

        c *= i += 5;

        System.out.println("c *= i += 5: " + c);

    }
}