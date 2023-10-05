package br.com.lab365.ecommercejava.service;

import br.com.lab365.ecommercejava.model.Produto;

import java.util.List;

public interface ProdutoService {

    Produto salvar(Produto produto) throws Exception;
    List<Produto> buscarTodos();
    Produto buscarPorId(Long Id) throws Exception;
    boolean apagar(Long id) throws Exception;

}
