// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ReprodutorMusical reprodutor = new ReprodutorMP3();

        reprodutor.selecionarMusica("Música 1");
        reprodutor.tocar();

        reprodutor.selecionarMusica("Música 2");
        reprodutor.tocar();
        reprodutor.pausar();

        // Instanciando e Utilizando a Classe Aparelho Telefónico

        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Instanciando e Utilizando a Classe NavegadorInternet

        NavegadorInternet navegador = new NavegadorInternet();

        navegador.adicionarNovaAba("www.example.com");
        navegador.exibirPagina("www.example.com");
        navegador.atualizarPagina("www.example.com");

        navegador.adicionarNovaAba("www.google.com");
        navegador.exibirPagina("www.google.com");
        navegador.atualizarPagina("www.google.com");

    }
}