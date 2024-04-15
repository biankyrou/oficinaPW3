package br.edu.ifsp.pw3.oficina.controllers;

import br.edu.ifsp.pw3.oficina.dtos.ConsertoRecordDTO;
import br.edu.ifsp.pw3.oficina.dtos.ListagemConsertoDTO;
import br.edu.ifsp.pw3.oficina.models.Conserto;
import br.edu.ifsp.pw3.oficina.repositories.ConsertoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@RestController
@RequestMapping("/consertos")
public class ConsertoController {
    @Autowired
    private ConsertoRepository repository;

    @GetMapping
    public Page<Conserto> listarConsertos(@PageableDefault(
            size = 1,
            page = 0,
            sort = {},
            direction = Sort.Direction.DESC) Pageable paginacao) {
        return repository.findAll(paginacao);
    }

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid ConsertoRecordDTO dados){
        repository.save(new Conserto(dados));
    }

    @GetMapping("/algunsdados")
    public List<ListagemConsertoDTO> listarAlgunsDados(){
        return repository.findAll().stream().map(ListagemConsertoDTO::new).toList();
    }
}
