package br.com.lab365.ecommercejava.controller;

import br.com.lab365.ecommercejava.model.Cliente;
import br.com.lab365.ecommercejava.service.ClienteService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @GetMapping
    public List<Cliente> get() {
        return clienteService.buscarTodos();
    }
    @GetMapping("{id}")
    public ResponseEntity getId(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(clienteService.buscarPorId(id));
        } catch (Exception e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }
    @PostMapping
    public ResponseEntity post(@RequestBody Cliente cliente) {
        try {
            return ResponseEntity.ok(clienteService.salvar(cliente));
        } catch (Exception e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }

    }

    @PutMapping("{id}")
    public ResponseEntity put(@PathVariable Long id, @RequestBody Cliente cliente) {
        try {
            cliente.setId(id);
            return ResponseEntity.ok(clienteService.salvar(cliente));
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(clienteService.apagar(id));
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

}

