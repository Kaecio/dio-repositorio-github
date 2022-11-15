package br.com.dio.exercicoOrientecaoObjeto;

import javax.xml.validation.Validator;

public class Carro extends Veiculo {

        String cor;
        String marca;
        String modelo;
        Double capacidadeTanque;

    Carro(String cor, String marca, String modelo, Double capacidadeTanque) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Carro() {

    }

    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getMarca() {
        return marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
