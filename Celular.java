public interface Celular {

    public void ligar();
    public void desligar();
    public String fazerLigacao(String numero);
    public String enviarMensagem(String numero, String mensagem);

}
