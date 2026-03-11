public class Main {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);
        listaSimples.exibirElementos();
        listaSimples.adicionarElemento("Arroz");
        listaSimples.adicionarElemento("Feijão");
        listaSimples.adicionarElemento("Batata");
        listaSimples.adicionarElemento("Arroz");
        listaSimples.adicionarElemento("Feijão");
        //listaSimples.removerElemento("Batata");

        listaSimples.removerTodas("Arroz");
        listaSimples.exibirElementos();
        listaSimples.contar();
        listaSimples.quantidadeElementos();
        String[] ophn = new String[3];
        ophn[0] = "a";
        ophn[1] = "b";
        ophn[2] = "c";
        listaSimples.adicionarVarios(ophn);
//        listaSimples.exibirElementos();
//        listaSimples.obter(2);
//        System.out.println(listaSimples.obter(3));
//        listaSimples.removerTodas("Feijão");
//        listaSimples.inserir(2,"Pão");
        listaSimples.exibirElementos();
        System.out.println(listaSimples.substituir("Feijão","papa"));
        listaSimples.exibirElementos();

    }
}
