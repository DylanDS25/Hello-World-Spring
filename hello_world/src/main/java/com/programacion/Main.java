package com.programacion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
public class Main {
    public static void main(String[] args) {

        var contexto = new AnnotationConfigApplicationContext(Main.class);
        contexto.register(HelloWorld.class);
        contexto.refresh();
        
        var instancia = contexto.getBean(HelloWorld.class);
        instancia.saludar();

        contexto.close();
    }
}