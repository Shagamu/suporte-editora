package com.curso.domains.dtos;


import com.curso.domains.Livro;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LivroDTO {

    private Long idLivro;

    @NotNull(message = "O campo titulo não pode ser nulo")
    @NotBlank(message = "O campo titulo não pode estar vazio")
    private String titulo;

    @NotNull(message = "O campo isbn não pode ser nulo")
    private String isbn;

    @NotNull(message = "O campo numeroPaginas não pode ser nulo")
    private int numeroPaginas;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCompra = LocalDate.now();

    @NotNull(message = "O campo valorCompra não pode ser nulo")
    @Digits(integer = 15, fraction = 3)
    private BigDecimal valorCompra;

    @NotNull(message = "O campo editora não pode ser nulo")
    private int idEditora;
    private String cnpj;
    private String razaoSocial;

    @NotNull(message = "O campo autor não pode ser nulo")
    private int idAutor;
    private String nome;
    private String documentoPessoal;

    private int status;
    private int conservacao;


    public LivroDTO() {
    }


    public LivroDTO(Livro livro) {
        this.idLivro = livro.getIdLivro();
        this.titulo = livro.getTitulo();
        this.isbn = livro.getIsbn();
        this.numeroPaginas = livro.getNumeroPaginas();
        this.dataCompra = livro.getDataCompra();
        this.valorCompra = livro.getValorCompra();
        this.idEditora = livro.getEditora().getIdEditora();
        this.cnpj = livro.getEditora().getCnpj();
        this.razaoSocial = livro.getEditora().getRazaoSocial();
        this.idAutor = livro.getAutor().getIdAutor();
        this.nome = livro.getAutor().getNome();
        this.documentoPessoal = livro.getAutor().getDocumentoPessoal();
        this.status = livro.getStatus().getIdStatus();
        this.conservacao = livro.getConservacao().getIdConserva();

    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }

    public @NotNull(message = "O campo titulo não pode ser nulo") @NotBlank(message = "O campo titulo não pode estar vazio") String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NotNull(message = "O campo titulo não pode ser nulo") @NotBlank(message = "O campo titulo não pode estar vazio") String titulo) {
        this.titulo = titulo;
    }

    public @NotNull(message = "O campo isbn não pode ser nulo") @NotBlank(message = "O campo isbn não pode estar vazio") String getIsbn() {
        return isbn;
    }

    public void setIsbn(@NotNull(message = "O campo isbn não pode ser nulo") @NotBlank(message = "O campo isbn não pode estar vazio") String isbn) {
        this.isbn = isbn;
    }

    @NotNull(message = "O campo numeroPaginas não pode ser nulo")
    @NotBlank(message = "o campo numeroPaginas não pode estar vazio")
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(@NotNull(message = "O campo numeroPaginas não pode ser nulo") @NotBlank(message = "o campo numeroPaginas não pode estar vazio") int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public @NotNull(message = "O campo valorCompra não pode ser nulo") @Digits(integer = 15, fraction = 3) BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(@NotNull(message = "O campo valorCompra não pode ser nulo") @Digits(integer = 15, fraction = 3) BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }


    @NotNull(message = "O campo editora não pode ser nulo")
    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(@NotNull(message = "O campo editora não pode ser nulo") int idEditora) {
        this.idEditora = idEditora;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @NotNull(message = "O campo autor não pode ser nulo")
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(@NotNull(message = "O campo autor não pode ser nulo") int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoPessoal() {
        return documentoPessoal;
    }

    public void setDocumentoPessoal(String documentoPessoal) {
        this.documentoPessoal = documentoPessoal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getConservacao() {
        return conservacao;
    }

    public void setConservacao(int conservacao) {
        this.conservacao = conservacao;
    }
}




