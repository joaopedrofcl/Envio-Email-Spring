package com.email.envio_email.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailEnvio {

    @Autowired
    private JavaMailSender emailSender;

    public void enviarEmail(DadosEnvioEmail dados) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(dados.getDestinatario());
        message.setSubject(dados.getAssunto());
        message.setText(dados.getCorpo());
        emailSender.send(message);
    }
    
}
