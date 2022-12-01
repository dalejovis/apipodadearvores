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


    SolicitacaoService service;
    @Autowired
    public SolicitacaoController(SolicitacaoService service){ //injeção por meio de construtor!
        this.service = service;
    }

    // Criação de nova Solicitação de poda
    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)  //se o retorno do metodo é ResponseEntitty<?>, não precisa colocar essa anotação.
    public ResponseEntity<Solicitacao> create(@RequestBody Solicitacao solicitacao) {
        Solicitacao solicitacaoCreated = service.create(solicitacao);

        return ResponseEntity.status(HttpStatus.CREATED).body(solicitacaoCreated); //alterei o codigo do status p status em si pra facilitar a compreensão
    }

    // Retorna todas as podas cadastradas (pode liberar essa opção apenas para administradores
    @GetMapping("/all")
    public List<Solicitacao> findAll() {
        return service.findAll();
    }

    // Retorna por id
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) { 
        if (service.findById(id) == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Essa solicitação não existe!");
        }
        Solicitacao solicitacao = service.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(solicitacao);
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
