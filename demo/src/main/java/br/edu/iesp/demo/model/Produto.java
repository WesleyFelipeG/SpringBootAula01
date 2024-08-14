package br.edu.iesp.demo.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Produto {
    private Integer id;
    private String nome;
    private String descricao;


}
