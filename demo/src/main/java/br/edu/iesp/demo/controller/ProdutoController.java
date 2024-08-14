package br.edu.iesp.demo.controller;

import br.edu.iesp.demo.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping
    public Produto getProduto(){
        return new Produto(1,"X-Box","Console");
    }

}
