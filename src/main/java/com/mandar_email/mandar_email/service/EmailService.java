package com.mandar_email.mandar_email.service;

import com.mandar_email.mandar_email.model.Formulario;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender mailSender;


    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void mandarEmail(Formulario formulario) {
        SimpleMailMessage mensagem = new SimpleMailMessage();
        mensagem.setFrom("enviaremail698@gmail.com");
        mensagem.setTo("caio.viana.39@gmail.com");
        mensagem.setSubject("Novo contato de " + formulario.getNome());
        mensagem.setText("Nome: " + formulario.getNome() + "\n" +
                "Email: " + formulario.getEmail() + "\n\n" +
                "Mensagem: " + formulario.getMensagem());

        mailSender.send(mensagem);
    }
}
