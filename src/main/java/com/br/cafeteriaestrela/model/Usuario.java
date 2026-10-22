package com.br.cafeteriaestrela.model;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    private  Integer registro;
    @Column(length = 80)
    private String nome;
    @Column(length = 40)
    private String email;
    @Column(length = 10)
    private  String senha;
    @DateTimeFormat(style = "yyyy-mm-dd")
    private LocalDate dataadimistrativo;
    private  Boolean ativo;
    // constructor

    public Usuario() {
    }

    public Usuario(long id, Integer registro, String nome, String email, String senha, LocalDate dataadimistrativo, Boolean ativo) {
        this.id = id;
        this.registro = registro;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataadimistrativo = dataadimistrativo;
        this.ativo = ativo;
    }
    //Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataadimistrativo(LocalDate dataadimistrativo) {
        this.dataadimistrativo = dataadimistrativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    //getter

    public long getId() {
        return id;
    }

    public Integer getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDate getDataadimistrativo() {
        return dataadimistrativo;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
