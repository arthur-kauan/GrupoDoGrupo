public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica listaDinamica = new ListaDinamica();
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Tucunare");
        listaDinamica.adicionarElemento("Feijão");
        listaDinamica.removerElemento("Feijão");
        System.out.println(listaDinamica.removerTodas("Arroz"));
        listaDinamica.exibirElementos();

        System.out.println("\n" + listaDinamica.contar());

        listaDinamica.limpar();

    }
}
