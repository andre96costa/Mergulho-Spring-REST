package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import com.algaworks.algalog.domain.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @GetMapping("/clientes")
    public List<Cliente> listar() {
        
        Cliente cliente1 = new Cliente(1L,"André", "andre@andre.com", "(99) 99999-9999");
        Cliente cliente2 = new Cliente(2L,"Aline", "aline@aline.com", "(99) 99999-9998");
        Cliente cliente3 = new Cliente(3L,"Miguel", "miguel@miguel.com", "(99) 99999-9997");
        // List<Cliente> clientes = new ArrayList<>();
        // clientes.add(cliente1);
        // clientes.add(cliente2);
        // clientes.add(cliente3);

        return Arrays.asList(cliente1,cliente2,cliente3);
    }
}
