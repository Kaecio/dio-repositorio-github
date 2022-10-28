package br.com.dio.exercicoOrientecaoObjeto;

import br.com.dio.exercicoOrientecaoObjeto.Carro;

public class RodarAplicacao {
    public static void main(String[] args) {


        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setMarca("Fiat");
        carro1.setModelo("Pulse");
        carro1.setCapacidadeTanque(50d);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.99));

        Carro carro2 = new Carro("Preto", "Fiat", "Argo", 45d);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.99));

        Carro carro3 = new Carro();
        carro3.cor = "branco";
        System.out.println(carro3);


    }
}
