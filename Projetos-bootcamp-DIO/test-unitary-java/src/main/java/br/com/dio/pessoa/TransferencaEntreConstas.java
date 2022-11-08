package br.com.dio.pessoa;

public class TransferencaEntreConstas {

    public void transfere(Conta contaOrigem, Conta contaDestini, int valor){
        if (valor <=0){
           throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }
}
