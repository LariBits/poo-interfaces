package polimorfismo;

public class Sms extends Notificacao {
    public Sms(String destinatario){
        super(destinatario);
    }

    @Override
    public void enviar (String mensagem){
        String LimitText = mensagem.substring(0, Math.min(20, mensagem.length()));
        System.out.println("Notificacao para " + destinatario);
        System.out.println("Mensagem: ");
        System.out.println(LimitText);
    }
}
