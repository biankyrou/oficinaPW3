package br.edu.ifsp.pw3.oficina.controllers;

import br.edu.ifsp.pw3.oficina.dtos.ConsertoRecordDTO;
import br.edu.ifsp.pw3.oficina.models.Conserto;
import br.edu.ifsp.pw3.oficina.repositories.ConsertoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consertos")
public class ConsertoController {
    @GetMapping
    public List<Conserto> listarConsertos() {
        return repository.findAll();
    }

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody ConsertoRecordDTO dados){
        repository.save(new Conserto(dados));
    }
}
