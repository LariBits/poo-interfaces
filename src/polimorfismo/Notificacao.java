package polimorfismo;

public class Notificacao {
    protected String destinatario;

    public Notificacao(String destinatario){
        this.destinatario = destinatario;
    }

    public void enviar (String mensagem){
        System.out.println("Notificacao para " + destinatario + ": " + mensagem);
    }
}
