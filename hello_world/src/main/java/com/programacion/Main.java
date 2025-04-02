package com.programacion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var contexto = new AnnotationConfigApplicationContext();
        contexto.register(HelloWorld.class);
        contexto.refresh();
        
        var instancia = contexto.getBean(HelloWorld.class);
        instancia.saludar();

        contexto.close();
    }
}