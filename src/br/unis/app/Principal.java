package br.unis.app;

public class Principal {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();

        Contato contato1 = new Contato("Gabriel", "2222222222");
        Contato contato2 = new Contato("Carlos", "9999999999");

        Mensagem mensagem1 = new MensagemDeTexto(contato1, "11:23", "Bom dia, como você está?");
        Mensagem mensagem2 = new MensagemDeTexto(contato2, "15:23", "Boa tarde, estou bem e você?");

        whatsapp.getContatos().add(contato1);
        whatsapp.getContatos().add(contato2);
        whatsapp.getMensagens().add(mensagem1);
        whatsapp.getMensagens().add(mensagem2);

        whatsapp.listarContatos();
        whatsapp.listarMensagens();
    }
}
