package br.com.dio.pessoa;

import java.util.function.LongBinaryOperator;
import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void conectaBD(){
        LOGGER.info("Conectou o banco");
    }

    public static void desconectaBD(){
        LOGGER.info("Desconectou o banco");
    }

    public static void insereDados(Pessoa pessoa){
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        LOGGER.info("deletou dados");
    }
}
