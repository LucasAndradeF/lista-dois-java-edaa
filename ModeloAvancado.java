import java.util.ArrayList;
import java.util.List;

public class ModeloAvancado implements Celular {
    private List<String> historicoLigacoes;
    private List<String> historicoMensagens;

    public ModeloAvancado() {
        historicoLigacoes = new ArrayList<>();
        historicoMensagens = new ArrayList<>();
    }

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
        historicoLigacoes.add(mensagem);
        return mensagem;
    }

    @Override
    public String enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviar Mensagem");
        String msg = "Enviando mensagem para: " + numero + "\nConteúdo da mensagem: " + mensagem;
        System.out.println(msg);
        historicoMensagens.add(numero + ": " + mensagem);
        return msg;
    }

    public void historicoLigacao() {
        System.out.println("Histórico de Ligação:");
        for (String ligacao : historicoLigacoes) {
            System.out.println(ligacao);
        }
    }

    public void historicoMensagem() {
        System.out.println("Histórico de Mensagens:");
        for (String mensagem : historicoMensagens) {
            System.out.println(mensagem);
        }
    }
}
