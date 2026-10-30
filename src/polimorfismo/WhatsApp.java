package polimorfismo;

public class WhatsApp extends Notificacao{
    public WhatsApp(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem){
        System.out.println("Notificacao para " + destinatario);
        System.out.println("Mensagem: ");
        System.out.println(mensagem);
    }
}
