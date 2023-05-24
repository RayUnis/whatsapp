package br.unis.app;

import java.util.List;
import java.util.ArrayList;

class Whatsapp {
    private List<Contato> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp() {
        contatos = new ArrayList<>();
        mensagens = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Celular: " + contato.getCelular());
        }
    }

    public void listarMensagens() {
        for (Mensagem mensagem : mensagens) {
            System.out.println("Destinatário: " + mensagem.getDestinatario().getNome());
            System.out.println("Hora de Envio: " + mensagem.getHoraEnvio());
            System.out.println("Conteúdo: " + mensagem.getConteudo());
        }
    }
}