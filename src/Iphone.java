public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos do Aparelho Telefônico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    // Implementação dos métodos do Navegador na Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Executor
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("=== Testando funcionalidades do iPhone ===");

        // Reprodutor Musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        System.out.println();

        // Aparelho Telefônico
        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();

        // Navegador de Internet
        iphone.exibirPagina("apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}