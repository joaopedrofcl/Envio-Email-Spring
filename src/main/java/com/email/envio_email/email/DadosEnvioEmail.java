package com.email.envio_email.email;

public class DadosEnvioEmail {
        private String destinatario;
        private String assunto;
        private String corpo;
    
        // getters e setters
        public String getDestinatario() {
            return destinatario;
        }
    
        public void setDestinatario(String destinatario) {
            this.destinatario = destinatario;
        }
    
        public String getAssunto() {
            return assunto;
        }
    
        public void setAssunto(String assunto) {
            this.assunto = assunto;
        }
    
        public String getCorpo() {
            return corpo;
        }
    
        public void setCorpo(String corpo) {
            this.corpo = corpo;
        }
    }
