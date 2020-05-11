package com.algaworks.osworks.domain.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private OrdemServico ordemServico;

    private String descricao;
    private OffsetDateTime dataEnvio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public OffsetDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(OffsetDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

}
