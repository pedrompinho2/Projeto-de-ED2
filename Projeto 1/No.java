public class No implements Comparable<No> {
    // Atributos de dados
    public char caractere;
    public int frequencia;

    // Atributos de estrutura (Árvore de Huffman)
    public No esquerda;
    public No direita;

    public No(char caractere, int frequencia) {
        this.caractere = caractere;
        this.frequencia = frequencia;
        this.esquerda = null;
        this.direita = null;
    }

    public No(int frequencia, No esquerda, No direita) {
        this.frequencia = frequencia;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int compareTo(No outroNo) {
        return this.frequencia - outroNo.frequencia; 
    }

    boolean eFolha() {
        return (esquerda == null && direita == null); 
    }
}