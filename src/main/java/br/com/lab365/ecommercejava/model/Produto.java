package br.com.lab365.ecommercejava.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public abstract class Produto implements List<Produto> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(columnDefinition = "text")
    private String descricao;

    @Column(length = 30, nullable = false)
    private String categoria;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(length = 20, nullable = false)
    private String marca;

    @Column(length = 10, nullable = false)
    private String cor;

    @Column(length = 10, nullable = false)
    private String tamanho;

}
