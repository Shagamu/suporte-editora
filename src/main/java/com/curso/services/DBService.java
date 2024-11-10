package com.curso.services;

import com.curso.domains.Autor;
import com.curso.domains.Editora;
import com.curso.domains.Livro;
import com.curso.domains.enums.Conservacao;
import com.curso.domains.enums.Status;
import com.curso.repositories.AutorRepository;
import com.curso.repositories.EditoraRepository;
import com.curso.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private AutorRepository autorRepo;

    @Autowired
    private EditoraRepository editoraRepo;

    @Autowired
    private LivroRepository livroRepo;

    public void initDB(){

        Editora editora01 = new Editora(null,"55545552153","Teste1");
        Editora editora02 = new Editora(null,"87885846288","Teste2");


        Autor autor01 = new Autor(null,"Arthur", "1597463214");
        Autor autor02 = new Autor(null,"Enzo","15639482574");


        Livro livro01 = new Livro(null,"Livro 1","1234",124,
                LocalDate.now(), new BigDecimal("50.00"), editora01, autor01, Status.LENDO,Conservacao.BOM);
        Livro livro02 = new Livro (null,"Livro 2","12345", 251,
                LocalDate.now(), new BigDecimal("100.00"), editora02, autor02,Status.LIDO, Conservacao.MARCADEUSO);


        editoraRepo.save(editora01);
        editoraRepo.save(editora02);
        autorRepo.save(autor01);
        autorRepo.save(autor02);
        livroRepo.save(livro01);
        livroRepo.save(livro02);
    }
}
