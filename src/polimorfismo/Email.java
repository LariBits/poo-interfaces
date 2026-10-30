package polimorfismo;

public class Email extends Notificacao {
    public Email (String destinatario){
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem){
        System.out.println("[Email] Para: " + destinatario);
        System.out.println("Assunto: Aviso");
        System.out.println(mensagem);
    }

    public void anexarArquivo(String nome){
        System.out.println("Arquivo anexado ao email: " + nome);
    }
}
