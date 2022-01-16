package br.com.calculadora.service;

import br.com.calculadora.vo.Numeros;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public String somaDoisNumeros(Numeros numeros){
        int soma = numeros.getNumero1() + numeros.getNumero2();
        return "O resultado da soma foi: " + soma;
    }

    public String subtraiDoisNumeros(Numeros numeros){
        int subtrai = numeros.getNumero1() - numeros.getNumero2();
        return "O resultado da subtração foi: " + subtrai;
    }

    public String dividiDoisNumeros(Numeros numeros){
        int dividir = numeros.getNumero1() / numeros.getNumero2();
        return "O resultado da divisão foi: " + dividir;
    }

    public String multiplicaDoisNumeros(Numeros numeros){
        int multiplica = numeros.getNumero1() * numeros.getNumero2();
        return "O resultado da mulplicação foi: " + multiplica;
    }
}