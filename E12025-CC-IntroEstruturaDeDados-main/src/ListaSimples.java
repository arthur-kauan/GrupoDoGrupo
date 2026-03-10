public class ListaSimples implements ListaOperacoes {
    String[] lista;

    public ListaSimples(int tamanho) {
        this.lista = new String[tamanho];
    }

    @Override
    public int removerTodas(String elemento) {
        int valores = 0;
        for (int i =0;i < this.lista.length;i++)
        {
            if(this.lista[i].equals(elemento)){
                this.lista[i] = null;
                valores++;
            }
        }
        System.out.println("Elementos removidos:" + valores);
        return valores;

    }

    @Override
    public int contar() {
        int cont = 0;
        if(!estaVazio()) {
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] != null) {
                    cont++;
                }
            }
        }
        System.out.println("A lista possui " + cont + " elementos!");
        return cont;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        int cont = 0;
        if(!estaVazio()) {
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] == null) {
                    this.lista[i] = elementos[cont];
                    cont++;
                }
            }
        }
        System.out.println("Adicionado " + cont + " elementos!");
        return cont;
    }

    @Override
    public String obter(int indice) {
        if(!estaVazio()){
            if (indice <= this.lista.length && indice > 0){
                return this.lista[indice];
            }
        }
        return "Valor de indice não identificado";
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        if(!estaVazio())
        {
            
        }
        return false;
    }

    @Override
    public String removerPorIndice(int indice) {
        if(!estaVazio())
        {
            String remocao = this.lista[indice];
            removerElemento(remocao);
            for (int i = indice; i <=this.lista.length ; i++) {
                String proxElemento = this.lista[i+1];
                if(proxElemento != null)
                {
                    this.lista[i] = proxElemento;
                } else if (i == this.lista.length) {
                    this.lista[i] = null;
                }


            }
        }
        return "";
    }

    @Override
    public void limpar() {

    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        return 0;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        return 0;
    }

    @Override
    public int substituir(String antigo, String novo) {
        return 0;
    }

    public void exibirElementos() {
        for (int i = 0; i < this.lista.length; i++) {
            System.out.println("Lista[" + i + "] = " + this.lista[i]);
        }
    }

    public void adicionarElemento(String elemento) {
        if (!estaCheia()) {
            this.lista[encontrarPosicaoVazia()] = elemento;
            System.out.println("Elemento " + elemento + " adicionado com sucesso!");
        }
    }


    private boolean estaCheia() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return false;
            }
        }
        System.out.println("A lista está cheia!");
        return true;
    }

    private boolean estaVazio() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] != null) {
                return false;
            }
        }
        System.out.println("A lista está vazia!");
        return true;
    }

    private int encontrarPosicaoVazia() {
        int i;
        for (i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return i;
            }
        }
        return i;
    }

    public void removerElemento(String elemento) {
        if (!estaVazio()) {
            if (this.buscarElemento(elemento) >= 0) {
                this.lista[this.buscarElemento(elemento)] = null;
                System.out.println("Elemento " + elemento + " removido com sucesso!");
            }
        }
    }

    public int buscarElemento(String elemento){
        int i;
        if (!estaVazio()) {
            for (i = 0; i < this.lista.length; i++) {
                if (this.lista[i].equals(elemento)) {
                    return i;
                }
            }
        }
        System.out.println("Elemento não encontrado na lista.");
        return -1;
    }

    public void alterarElemento(String elementoASerAlterado, String alteracao) {
        if(buscarElemento(elementoASerAlterado) >= 0) {
            this.lista[buscarElemento(elementoASerAlterado)] = alteracao;
            System.out.println("Elemento " + elementoASerAlterado + " alterado com sucesso para " + alteracao);
        }
    }

    public void quantidadeElementos() {
        int cont = 0;
        if(!estaVazio()) {
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] != null) {
                    cont++;
                }
            }
        }
        System.out.println("A lista possui " + cont + " elementos!");
    }

}
