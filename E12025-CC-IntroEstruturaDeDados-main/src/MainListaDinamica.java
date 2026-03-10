public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica listaDinamica = new ListaDinamica();
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Feijão");
        listaDinamica.removerElemento("Feijão");
        listaDinamica.exibirElementos();
    }
}
