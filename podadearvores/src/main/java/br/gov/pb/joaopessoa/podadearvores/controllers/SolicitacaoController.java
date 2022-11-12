package br.gov.pb.joaopessoa.podadearvores.controllers;

import br.gov.pb.joaopessoa.podadearvores.models.Solicitacao;
import br.gov.pb.joaopessoa.podadearvores.services.SolicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/podadearvores")
public class SolicitacaoController {

    @Autowired
    SolicitacaoService service;

    // Criação de nova Solicitação de poda
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Solicitacao> create(@RequestBody Solicitacao solicitacao) {
        Solicitacao solicitacaoCreated = service.create(solicitacao);

        return ResponseEntity.status(201).body(solicitacaoCreated);
    }
    // Retorna todas as podas cadastradas (pode liberar essa opção apenas para administradores
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Solicitacao> findAll() {
        return service.findAll();
    }

    // Retorna por id
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Solicitacao> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    // Criar um retorno por nome do solicitante

    // Criar um retorno por nome do bairro

//    @PutMapping("/{id}")
//    @ResponseStatus(HttpStatus.CREATED)
//    public

    // Deleta uma soliciação por id
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
