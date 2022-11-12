package br.gov.pb.joaopessoa.podadearvores.repositories;

import br.gov.pb.joaopessoa.podadearvores.models.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {}
