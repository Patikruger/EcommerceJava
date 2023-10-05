package br.com.lab365.ecommercejava.service;

import br.com.lab365.ecommercejava.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente salvar(Cliente cliente) throws Exception;
    List<Cliente> buscarTodos();
    Cliente buscarPorId(Long Id) throws Exception;
    boolean apagar(Long id) throws Exception;

}
