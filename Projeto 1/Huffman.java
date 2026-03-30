public class Huffman {
    private int[] frequencias;
    private String[] tabelaCodigos;
    private No raiz;

    public Huffman() {
        this.frequencias = new int[256]; // Tamanho para tabela ASCII
        this.tabelaCodigos = new String[256];
    }

    public void Frequencia(String caminhoArquivo) {
        try (FileInputStream fis = new FileInputStream(caminhoArquivo)) {
            int caractereLido;
            
            while ((caractereLido = fis.read()) != -1) { //read() le um byte do arquivo e retorna um valor de 0 a 255
                this.frequencias[caractere]++;//Incrementam na posição correspondente ao valor do caractere ASCII
            }
        }
        // exibir tabela
        System.out.println("ETAPA 1: Tabela de Frequencia de Caracteres");
        for (int i = 0; i < 256; i++) {
            if (this.frequencias[i] > 0) {
                System.out.println("Caractere '" + (char) i + "' (ASCII: " + i + "): " + this.frequencias[i]);
            }
        }
    }
    //ETAPA 2 e 3: Alimenta o Min-Heap e constrói a Árvore de Huffman
    public void montarArvore() {

        MinHeap heap = new MinHeap();

        for (int i = 0; i < 256; i++) { //alimenta o heap
            if (this.frequencias[i] > 0) {
                No novoNo = new No((char) i, this.frequencias[i]);
                heap.inserir(novoNo);
            }
        }

        System.out.println("\nETAPA 2: Min-Heap Inicial");

        //constropi a arvore com um laço que roda enquanto o heap tiver mais de 1 nó
        while (heap.tamanho() > 1) { //Remove os dois nós com menor frequencia
            
            No esquerdo = heap.remover();
            No direito = heap.remover();

            // 2. Cria um novo nó pai. A frequência dele é a soma dos dois filhos.
            // Obs: Usamos o construtor de nó interno (sem caractere específico).
            int somaFrequencias = esquerdo.frequencia + direito.frequencia;
            No novoPai = new No(somaFrequencias, esquerdo, direito);

            // 3. Insere o novo pai de volta no Heap para continuar o processo
            heap.inserir(novoPai);
        }

        // Quando o laço termina, sobrou apenas 1 nó no Heap. 
        // Esse nó é a raiz de toda a nossa Árvore de Huffman!
        this.raiz = heap.remover();
        System.out.println("\nETAPA 3: Arvore de Huffman");
        imprimirArvore(this.raiz, "");
    }

    /**
     * ETAPA 4: Percorre a árvore recursivamente para gerar os códigos binários[cite: 3390, 3391].
     */
    public void gerarTabelaCodigos(No atual, String caminho) {
        // Se for folha, salvar caminho (String de 0s e 1s) na tabela [cite: 3438, 3439]
    }

    /**
     * ETAPA 5: Grava o cabeçalho (frequências) e o conteúdo codificado[cite: 3392, 3394].
     */
    public void gravarArquivoComprimido(String caminhoDestino) {
        // Escrever frequências e a sequência de bits codificada [cite: 3394, 3443]
    }

    // --- MÉTODOS DE DESCOMPRESSÃO ---

    /**
     * Reconstrói a árvore a partir das frequências lidas do cabeçalho[cite: 3396].
     */
    public void reconstruirArvoreDesdeCabecalho(int[] freqLidas) {
        // Reutiliza a lógica do Min-Heap para recriar a árvore idêntica [cite: 3396]
    }

    /**
     * Realiza o "Percurso Guiado": lê bits e desce na árvore até achar folhas[cite: 3399, 3400].
     */
    public void descompressaoPercursoGuiado(String caminhoOrigem, String caminhoDestino) {
        // 0 = esquerda, 1 = direita. Ao chegar na folha, escreve caractere[cite: 3402, 3406].
    }
}