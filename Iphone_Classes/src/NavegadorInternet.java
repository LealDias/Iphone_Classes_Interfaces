import java.util.ArrayList;
import java.util.List;
public class NavegadorInternet {

    private List<String> abasAbertas;

    public NavegadorInternet() {
        this.abasAbertas = new ArrayList<>();
    }

    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página: " + pagina);
    }

    public void adicionarNovaAba(String pagina) {
        abasAbertas.add(pagina);
        System.out.println("Nova aba adicionada: " + pagina);
    }

    public void atualizarPagina(String pagina) {
        if (abasAbertas.contains(pagina)) {
            System.out.println("Atualizando página: " + pagina);
        } else {
            System.out.println("Página não encontrada na lista de abas abertas.");
        }

    }
}