package com.programacion;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public void saludar() {
        System.out.println("Hello World desde Spring");
    }
}
