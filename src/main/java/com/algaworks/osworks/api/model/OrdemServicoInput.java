package com.algaworks.osworks.api.model;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class OrdemServicoInput {

    @NotBlank
    private String descricao;

    @NotNull
    private BigDecimal preco;

    @Valid
    @NotNull
    private ClienteIdInput clienteId;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public ClienteIdInput getClienteId() {
        return clienteId;
    }

    public void setClienteId(ClienteIdInput clienteId) {
        this.clienteId = clienteId;
    }

}
