package br.com.lab365.ecommercejava.service;

import br.com.lab365.ecommercejava.model.Pedido;

public interface PedidoService {

    Pedido criar (Pedido pedido) throws Exception;

    Pedido buscarPorId(Long Id) throws Exception;

    Object buscarPorStatus(Integer status) throws Exception;

    Object alterarStatus(Long id, Integer status) throws Exception;
}
