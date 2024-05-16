package com.email.envio_email.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.envio_email.email.DadosEnvioEmail;
import com.email.envio_email.email.EmailEnvio;

@RestController
public class EmailController {

    @Autowired
    private EmailEnvio emailEnvio;

    @PostMapping("/enviar-email")
    public void enviarEmail(@RequestBody DadosEnvioEmail dados){
        emailEnvio.enviarEmail(dados);
    }
    }
