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
            if(this.lista[this.lista.length-1] == null)
            {
                for (int i = this.lista.length-1; i >indice; i--) {
                    this.lista[i] = this.lista[i-1];
                 }
                this.lista[indice] = elemento;
                System.out.println("Sucesso, elemento inserido");

            }
            System.out.println("Falha ao inserir");
        }
        return false;
    }

    @Override
    public String removerPorIndice(int indice) {
        if(!estaVazio())
        {
            if(this.lista[indice] != null) {
                this.lista[indice] = null;
                for (int i = indice; i < this.lista.length-1; i++) {

                    this.lista[i] = this.lista[i + 1];
                }
                this.lista[this.lista.length-1] = null;
                return "Elemento do indice: " + indice + " removido!";
            }
            return "Indice já está vazio";
        }
        return "Lista vazia";
    }

    @Override
    public void limpar() {
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = null;
        }
    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        int posicaoFinal = 0;
        for (int i = 0; i <this.lista.length; i++) {
            if(this.lista[i].equals(elemento)){
                posicaoFinal = i;
            }

        }
        return posicaoFinal;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int cont = 0;
        for (int i = 0; i <this.lista.length; i++) {
            if(this.lista[i].equals(elemento)){
                cont++;
            }

        }
        return cont;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int cont = 0;
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i].equals(antigo)) {
                this.lista[i] = novo;
                cont++;
            }
        }
        return cont;
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
