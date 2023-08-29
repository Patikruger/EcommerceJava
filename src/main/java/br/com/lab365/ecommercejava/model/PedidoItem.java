package br.com.lab365.ecommercejava.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class PedidoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal totalItem;



}
