package br.com.dio.junit;

import br.com.dio.pessoa.BancoDeDados;
import br.com.dio.pessoa.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.conectaBD();

    }

    @BeforeEach
    void inseriDadosPessoa(){
        BancoDeDados.insereDados( new Pessoa("Kaecio", LocalDate.of(1984, 07,12 )));
    }

    @AfterEach
    void removeDadosPessoa(){
        BancoDeDados.removeDados( new Pessoa("Kaecio", LocalDate.of(1984, 07,12 )));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue( true);
    }

    @AfterAll
    static void finalizaConexao(){
        BancoDeDados.desconectaBD();

    }
}
