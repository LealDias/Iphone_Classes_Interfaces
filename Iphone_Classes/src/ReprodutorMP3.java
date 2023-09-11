// Classe ReprodutorMP3 implementando a interface ReprodutorMusical
public class ReprodutorMP3 implements ReprodutorMusical {
    private String musicaAtual;

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para tocar.");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("Pausando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para pausar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionando música: " + musica);

    }
}
