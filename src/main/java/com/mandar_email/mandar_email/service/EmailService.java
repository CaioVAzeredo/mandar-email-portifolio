package com.mandar_email.mandar_email.service;

import com.mandar_email.mandar_email.model.Formulario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void mandarEmail(Formulario formulario) {
        SimpleMailMessage mensagem = new SimpleMailMessage();
        mensagem.setFrom("enviaremail698@gmail.com");
        mensagem.setTo("caio.viana.39@gmail.com");
        mensagem.setText("Nome: " + formulario.getNome() + "\n" +
                "Email: " + formulario.getEmail() + "\n\n" +
                "Mensagem: " + formulario.getMensagem());

        mailSender.send(mensagem);
    }
}
