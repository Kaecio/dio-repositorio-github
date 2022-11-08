package br.com.dio.junit;

import br.com.dio.pessoa.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){
        Pessoa kaecio = new Pessoa("Kaecio", LocalDate.of(1984,11,1));
        Assertions.assertEquals(38, kaecio.getIdade());
    }

    @Test
    void validaSeEhMaiorDeIdade(){
        Pessoa kaecio = new Pessoa("kaecio", LocalDate.of(1984, 07,12));
        Assertions.assertTrue(kaecio.ehMaiorDeIdade());

    }

    @Test
    void validaSeEhMenorDeIdade(){
        Pessoa eros = new Pessoa("kaecio", LocalDate.of(2017, 05,31));
        Assertions.assertFalse(eros.ehMaiorDeIdade());
    }
}
