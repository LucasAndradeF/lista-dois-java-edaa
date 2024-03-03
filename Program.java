public class Program {
    public static void main(String[] args) {
        
        ModeloBasico mb = new ModeloBasico();
        System.out.println("Funcionalidades do Modelo Básico");
        mb.ligar();
        mb.enviarMensagem("97777-7777", "Bom dia! O Sol já nasceu na fazendinha.");        
        mb.fazerLigacao("97777-7777");
        mb.desligar();
                
        ModeloAvancado ma = new ModeloAvancado();
        System.out.println();
        System.out.println("Funcionalidades do Modelo Avançado");
        ma.ligar();
        ma.enviarMensagem("98888-8888", "Cr7, bom dia! Gentileza me enviar os 15mil que eu te emprestei na semana passada.");
        ma.fazerLigacao("95555-7777");
        ma.historicoLigacao();
        ma.historicoMensagem();
        ma.desligar();
    }

}
