package br.com.calculadora; //fazendo interação com a pasta de controle e serviços do programa

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //interagindo com o Gradle
public class CalculadoraApplication {
    public static void main (String[] args){
        SpringApplication.run(CalculadoraApplication.class);
    }
}