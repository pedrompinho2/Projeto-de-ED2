import java.io.IOException;

//Projeto 1 - Compressão de Huffman
//Disciplina: Estrutura de Dados II

public class Main {

    public static void main(String[] args) {
        if (args.length != 3) {
            exibirInstrucoes();
            return;
        }
        String comando = args[0].toLowerCase();
        String arquivoOrigem = args[1];
        String arquivoDestino = args[2];

        try {
            if (comando.equals("c")) {
                executarCompressao(arquivoOrigem, arquivoDestino);
            } else if (comando.equals("d")) {
                executarDescompressao(arquivoOrigem, arquivoDestino);
            } else {
                System.out.println("Erro: Comando '" + comando + "' inválido.");
                exibirInstrucoes();
            }
        } catch (Exception e) {
            System.err.println("Ocorreu um erro durante a operação: " + e.getMessage());
        }
    }

    //Gerencia o fluxo de compressão dividido nas 5 etapas exigidas
     
    private static void executarCompressao(String origem, String destino) throws IOException {
        System.out.println("Iniciando compressão de: " + origem);
        
        // ETAPA 1: Análise de Frequência [cite: 3359, 3455]
        // TODO: huffman.gerarFrequencias(origem);

        // ETAPA 2: Min-Heap Inicial [cite: 3362, 3458]
        // TODO: heap.exibirEstadoVetor();

        // ETAPA 3: Construção da Árvore de Huffman [cite: 3388, 3460]
        // TODO: huffman.montarArvore();

        // ETAPA 4: Geração da Tabela de Códigos [cite: 3390, 3467]
        // TODO: huffman.gerarTabela();

        // ETAPA 5: Escrita do Arquivo e Resumo [cite: 3392, 3471]
        // TODO: huffman.gravarArquivoComprimido(destino);
    }

    //Gerencia o fluxo de descompressão e reconstrução

    private static void executarDescompressao(String origem, String destino) throws IOException {
        System.out.println("Iniciando descompressão de: " + origem);
        
        // 1. Ler cabeçalho e reconstruir árvore [cite: 3396]
        // 2. Realizar o percurso guiado pelos bits [cite: 3399]
        // 3. Gravar arquivo restaurado [cite: 3406]
    }

    private static void exibirInstrucoes() {
        System.out.println("Uso incorreto!");
        System.out.println("Para comprimir: java -jar huffman.jar c <arquivo_original> <arquivo_comprimido>");
        System.out.println("Para descomprimir: java -jar huffman.jar d <arquivo_comprimido> <arquivo_restaurado>");
    }
}