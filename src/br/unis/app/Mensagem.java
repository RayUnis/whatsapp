package br.unis.app;

abstract class Mensagem {
    private Contato destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contato destinatario, String horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public Contato getDestinatario() {
        return destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }
}