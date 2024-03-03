public class ModeloBasico implements Celular {

    @Override
    public void ligar() {
        System.out.println("** Ligar o aparelho **");
        System.out.println("Aparelho iniciado com sucesso.");
    }

    @Override
    public void desligar() {
        System.out.println("** Desligar o aparelho **");
        System.out.println("Aparelho desligado com sucesso.");
    }

    @Override
    public String fazerLigacao(String numero) {
        System.out.println("** Fazer ligação **");
        String mensagem = "Realizando ligação para o número solicitado: " + numero;
        System.out.println(mensagem);
        return mensagem;        
    }

    @Override
    public String enviarMensagem(String numero, String mensagem) {
        System.out.println("** Enviar Mensagem **");
        String msg = "Enviando mensagem para: " + numero + "\nConteúdo da mensagem : " + mensagem;
        System.out.println(msg);
        return msg;
    }

}
