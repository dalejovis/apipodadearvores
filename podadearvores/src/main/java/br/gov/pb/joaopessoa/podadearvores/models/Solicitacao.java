package br.gov.pb.joaopessoa.podadearvores.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Solicitacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;    // Dados do solicitante

    @Column(nullable = false, length = 70)
    private String email;

    @Column(nullable = false, length = 11)
    private String contato;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false, length = 50)
    private String rua;     // Dados do local da poda (!!!)

    @Column(nullable = false, length = 30)
    private String bairro;

    @Column(nullable = false, length = 6)
    private int numero;

    @Column(nullable = false, length = 8)
    private String cep;

    @Column(length = 150)
    private String detalhes;

}
