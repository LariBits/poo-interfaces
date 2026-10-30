package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Notificacao[] canais = {
                new Email("larissa@gmail.ccom"),
                new Sms("(11)1111-1111"),
                new Notificacao("Geral")
        };

        for(Notificacao n : canais){
            n.enviar("Sua matricula foi confirmada com sucesso!");
        }

        System.out.println("==== Teste metodo avisar ====");
        avisar(canais[0]); //email
        avisar(canais[1]); //sms

        System.out.println("==== Teste de cast ====");
        ((Email) canais[0]).anexarArquivo("edital.pdf");
    }

    static void avisar (Notificacao n){
        n.enviar("Prova adiada para sexta-feira.");
    }
}
