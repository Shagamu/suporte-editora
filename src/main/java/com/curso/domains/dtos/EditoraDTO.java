package com.curso.domains.dtos;

import com.curso.domains.Editora;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EditoraDTO {

    private Integer idEditora;

    @NotNull(message="O campo cnpj não pode ser nulo")
    @NotBlank(message="o campo cnpj não pode estar vazio")
    private String cnpj;
    private String razaoSocial;

    public EditoraDTO() {
    }

    public EditoraDTO(Editora editora) {
        this.idEditora = editora.getIdEditora();
        this.cnpj = editora.getCnpj();
        this.razaoSocial = editora.getRazaoSocial();
    }

    public Integer getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(Integer idEditora) {
        this.idEditora = idEditora;
    }

    public @NotNull(message = "O campo cnpj não pode ser nulo") @NotBlank(message = "o campo cnpj não pode estar vazio") String getCnpj() {
        return cnpj;
    }

    public void setCnpj(@NotNull(message = "O campo cnpj não pode ser nulo") @NotBlank(message = "o campo cnpj não pode estar vazio") String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
