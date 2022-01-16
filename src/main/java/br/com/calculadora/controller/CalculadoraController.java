package br.com.calculadora.controller;

import br.com.calculadora.vo.Numeros;
import br.com.calculadora.service.CalculadoraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    private final CalculadoraService calculadoraService;

    @PostMapping(value = "/soma")
    public String somaDoisNumeros(@RequestBody Numeros numeros){
        return calculadoraService.somaDoisNumeros(numeros);
    }

    @PostMapping(value = "/subtrair")
    public String subtraiDoisNumeros(@RequestBody Numeros numeros){
        return calculadoraService.subtraiDoisNumeros(numeros);
    }

    @PostMapping(value = "/dividir")
    public String dividiDoisNumeros(@RequestBody Numeros numeros){
        return calculadoraService.dividiDoisNumeros(numeros);
    }

    @PostMapping(value = "/multiplicar")
    public String multiplicaDoisNumeros(@RequestBody Numeros numeros){
        return calculadoraService.multiplicaDoisNumeros(numeros);
    }
}