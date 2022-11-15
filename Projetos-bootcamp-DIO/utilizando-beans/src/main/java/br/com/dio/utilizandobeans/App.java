package br.com.dio.utilizandobeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Livro 1");
        livro.setCodigo("Q298O99N0");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Joao");

        livro.exibir();

        ((AbstractApplicationContext) factory).close();

    }
}
