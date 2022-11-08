package br.com.dio.junit;

import br.com.dio.pessoa.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.CompositeName;

public class ExceptionsTest {

    @Test
    void validarCenarioDeExcecaoTranferencia(){
        Conta contaOrigem = new Conta(12345, 0);
        Conta contaDestino = new Conta(54321, 100);
        
    }
}
