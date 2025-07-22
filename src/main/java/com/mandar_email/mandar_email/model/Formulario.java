package com.mandar_email.mandar_email.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Formulario {

    @Email(message = "Deve ser um endereço de email válido")
    private String nome;

    @NotBlank(message = "Deve conter um destinatario")
    @Email(message = "Deve ser um endereço de email válido")
    private String email;

    @NotBlank(message = "Deve conter um assunto")
    private String mensagem;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String assunto) {
        this.mensagem = assunto;
    }
}
