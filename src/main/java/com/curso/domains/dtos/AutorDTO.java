package com.curso.domains.dtos;

import com.curso.domains.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AutorDTO {

    private Integer idAutor;

    @NotNull(message="O campo descricao não pode ser nulo")
    @NotBlank(message="O campo descricao não pode estar vazio")
    private String nome;

    @NotNull(message="o campo documentoPessoal não pode ser nulo")
    @NotBlank(message="o campo documentoPessoal não pode ser nulo")
    private String documentoPessoal;

    public AutorDTO() {}

    public AutorDTO(Autor autor){
        this.idAutor = autor.getIdAutor();
        this.nome=autor.getNome();
        this.documentoPessoal=autor.getDocumentoPessoal();
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public @NotNull(message = "O campo descricao não pode ser nulo") @NotBlank(message = "O campo descricao não pode estar vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo descricao não pode ser nulo") @NotBlank(message = "O campo descricao não pode estar vazio") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "o campo documentoPessoal nao pode ser nulo") @NotBlank(message = "o campo documentoPessoal não pode ser nulo") String getDocumentoPessoal() {
        return documentoPessoal;
    }

    public void setDocumentoPessoal(@NotNull(message = "o campo documentoPessoal não pode ser nulo") @NotBlank(message = "o campo documentoPessoal não pode ser nulo") String documentoPessoal) {
        this.documentoPessoal = documentoPessoal;
    }
}
