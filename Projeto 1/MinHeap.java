import java.util.ArrayList;

public class MinHeap {
    
    public ArrayList<No> stack;

    public MinHeap() {
        this.stack = new ArrayList<>();
    }

    public void inserir(No novoNo) {
        
        stack.add(novoNo); //Adiciona um novo nó no final da árvore
        int indiceAtual = stack.size() //Descobre o índice desse novo nó 
        subir(indiceAtual); //faz ele subir até a posição correta
        
    }

    public No remover() {
        if (heap.isEmpty()) {
            return null;
        }
        //Troca o topo com o ultimo elemento
        No menorNo = heap.get(0);
        int ultimo = heap.size() - 1;
        No ultimoNo = heap.get(ultimo);
        //Remove o ultimo

        heap.set(0, ultimoNo);
        heap.remove(ultimoIndice);
        if (!heap.isEmpty()) {
            descer(0);
        }
        return menorNo; //retorna o menos valor
    }
        return null; 
    }

    public void subir(int i) {
        while (i > 0) {
            
            int pai = (i - 1) / 2; //calculo do pai
            No noAtual = heap.get(i);
            No noPai = heap.get(pai);
            
            if (noAtual.compareTo(noPai) < 0) {
                heap.set(i, noPai);
                heap.set(pai, noAtual);
                i = pai; //atualiza o indice
            } else {
                break;
            }
        }
    }

    public void descer(int i) {

        int tamanho = stack.size();
        int menor = i;
        int filhoEsquerdo = 2 * i + 1;
        int filhoDireito = 2 * i + 2;

        //verifica se o filho esquerdo se é menor que o nó atual
        if (filhoEsquerdo < tamanho && stack.get(filhoEsquerdo).compareTo(stack.get(menor)) < 0) {
            menor = filhoEsquerdo;
        }
        //verifica se o filho direito é menor que o menor
        if (filhoDireito < tamanho && stack.get(filhoDireito).compareTo(stack.get(menor)) < 0) {
            menor = filhoDireito;
        }

        //se o menor não for o pai um dos filhos é menor que ele
        if (menor != i) {
            //troca o pai de lugar com o menor filho
            No temp = stack.get(i);
            stack.set(i, heap.get(menor));
            stack.set(menor, temp);
            descer(menor);
        }
    }

    public int tamanho() {
        return heap.size();
    }
}