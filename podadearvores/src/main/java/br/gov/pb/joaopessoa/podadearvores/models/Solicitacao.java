package br.gov.pb.joaopessoa.podadearvores.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Solicitacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;    // Dados do solicitante

    private String email;

    private String cpf;

    private String rua;     // Dados do local da poda (!!!)

    private String bairro;

    private int numero;

    private String cep;

    private String detalhes;

}
