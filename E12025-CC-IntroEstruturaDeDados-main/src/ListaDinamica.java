public class ListaDinamica implements ListaOperacoes {
    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista Dinâmica criada com sucesso!");
    }

    public void adicionarElemento(String conteudo) {
        if(!this.existeInicio()) {
            this.inicio.setConteudo(conteudo);
        } else {
            No novoNo = new No(conteudo);
            No aux = this.inicio;
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    private boolean existeInicio() {
        if(this.inicio.getConteudo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public void exibirElementos() {
        if(existeInicio()) {
            No aux = this.inicio;
            while(aux.getProx() != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(aux.getConteudo());
        } else {
            System.out.println("Não existem elementos na Lista Dinâmica.");
        }
    }

    public void removerElemento(String elemento) {
        if(existeInicio()) {
            if(buscarElemento(elemento)) {
                //removendo primeiro
                if(this.inicio.getConteudo().equals(elemento)) {
                    this.inicio = this.inicio.getProx();
                } else if(this.inicio.getProx() != null) {
                    No aux = this.inicio;
                    do {
                        if(aux.getProx().getConteudo().equals(elemento)) {
                            aux.setProx(aux.getProx().getProx());
                            return;
                        }
                        aux = aux.getProx();
                    } while (aux != null);
                } else {
                    this.inicio.setConteudo(null);
                }

                //removendo intermediário
                //método de busca
            }

        } else {
            System.out.println("Não existem elementos na lista.");
        }
    }

    public boolean buscarElemento(String elemento) {
        No aux = this.inicio;

        do {
            if (aux.getConteudo().equals(elemento)) {
                System.out.println("Elemento " + elemento + " encontrado.");
                return true;
            }
            aux = aux.getProx();
        } while (aux != null);
        System.out.println("Elemento " + elemento + " não encontrado!");
        return false;
    }

    @Override
    public int removerTodas(String elemento) {
    int i = 0;
    if (!existeInicio()) return 0;

    // 1. Trata remoções no início da lista (o "novo" início pode ser o elemento também)
    while (this.inicio != null && this.inicio.getConteudo().equals(elemento)) {
        this.inicio = this.inicio.getProx();
        i++;
    }

    // 2. Trata remoções no restante da lista
    if (this.inicio != null) {
        No ant = this.inicio;
        No aux = this.inicio.getProx();

        while (aux != null) {
            if (aux.getConteudo().equals(elemento)) {
                ant.setProx(aux.getProx());
                i++;
                aux = ant.getProx();
            } else {
                ant = aux;
                aux = aux.getProx();
            }
        }
    }
    return i;
    }

    @Override
    public int contar() {
        return 0;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        return 0;
    }

    @Override
    public String obter(int indice) {
        return "";
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        return false;
    }

    @Override
    public String removerPorIndice(int indice) {


        return "";
    }

    @Override
    public void limpar() {


    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        No aux = this.inicio;
        int i = 0;
        int ultimoIndice = 0;
        while (aux != null && aux.getConteudo() != null)
        {
            if(aux.getConteudo().equals(elemento))
            {
                ultimoIndice = i;
            }
            aux = aux.getProx();
            i++;
        }
        return ultimoIndice;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int i = 0;
        if (existeInicio()) {
            No aux = this.inicio;

            while (aux != null && aux.getConteudo() != null) {
                if (aux.getConteudo().equals(elemento)) {

                    i++;
                }
                aux = aux.getProx();
            }
        }
        return i;
    }

    @Override
    public int substituir(String antigo, String novo) {
        No aux = this.inicio;
        int i = 0;
        do{
            if(aux.getConteudo().equals(antigo))
            {
                aux.setConteudo(novo);
                i++;
            }
            aux = aux.getProx();
        }while (aux != null && aux.getConteudo() != null);
        return i;
    }
}
