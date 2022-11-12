package br.gov.pb.joaopessoa.podadearvores.services;

import br.gov.pb.joaopessoa.podadearvores.models.Solicitacao;
import br.gov.pb.joaopessoa.podadearvores.repositories.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoService {
    @Autowired
    SolicitacaoRepository repository;

    public Solicitacao create(Solicitacao solicitacao){
        return repository.save(solicitacao);
    }

    public List<Solicitacao> findAll() {
        return repository.findAll();
    }

    public Optional<Solicitacao> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
