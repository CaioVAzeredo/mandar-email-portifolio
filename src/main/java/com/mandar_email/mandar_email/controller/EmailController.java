package com.mandar_email.mandar_email.controller;


import com.mandar_email.mandar_email.model.Formulario;
import com.mandar_email.mandar_email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contato")
@CrossOrigin(origins = "*")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> enviar(@RequestBody Formulario formulario) {
        emailService.mandarEmail(formulario);
        return ResponseEntity.ok("Mensagem enviada com sucesso!!");
    }
}
