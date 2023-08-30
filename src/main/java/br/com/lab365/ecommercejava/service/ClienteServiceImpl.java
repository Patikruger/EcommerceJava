package br.com.lab365.ecommercejava.service;

import br.com.lab365.ecommercejava.model.Cliente;
import br.com.lab365.ecommercejava.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente salvar(Cliente cliente) throws Exception {
        return null;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public List<Cliente> buscarPorId(Long Id) throws Exception {
        return null;
    }

    @Override
    public boolean apagar(Long id) throws Exception {
        return false;
    }
}
