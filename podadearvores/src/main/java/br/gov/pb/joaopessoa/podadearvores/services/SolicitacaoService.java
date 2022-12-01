package br.gov.pb.joaopessoa.podadearvores.services;

import br.gov.pb.joaopessoa.podadearvores.models.Solicitacao;
import br.gov.pb.joaopessoa.podadearvores.repositories.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoService {

    SolicitacaoRepository repository;

    @Autowired
    public SolicitacaoService(SolicitacaoRepository repository1) {
        this.repository = repository1;
    }

    public Solicitacao create(Solicitacao solicitacao) {
        return repository.save(solicitacao);
    }

    public List<Solicitacao> findAll() {
        return repository.findAll();
    }

    public Solicitacao findById(Long id) { //if pra impedir de retornar 200 caso não exista solicitações.
        Optional<Solicitacao> solicitacao = repository.findById(id);
        if (solicitacao.isPresent()) {
            return solicitacao.get();
        }
        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
