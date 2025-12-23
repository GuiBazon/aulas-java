import java.util.Arrays; // Importamos uma classe utilitária para ajudar a visualizar

public class Aula04_ArraysMatrizes {
    public static void main(String[] args) {

        /*
         * =================================================================
         * PARTE 1: VETORES (ARRAYS UNIDIMENSIONAIS)
         * =================================================================
         */

        // FORMA 1: Declaração com Tamanho Definido (mas vazio)
        // O comando 'new' aloca espaço na Memória Heap.
        // O Java preenche automaticamente com valores padrão:
        // int -> 0, double -> 0.0, boolean -> false, Objetos -> null
        int[] notas = new int[4]; 

        // Atribuindo valores manualmente
        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 75;
        notas[3] = 100;
        // notas[4] = 50; // ERRO FATAL: ArrayIndexOutOfBoundsException (Índice 4 não existe, vai de 0 a 3)

        // FORMA 2: Declaração com Inicialização (Já sabendo os valores)
        String[] frutas = { "Maçã", "Banana", "Uva" };

        /*
         * =================================================================
         * PARTE 2: ITERAÇÃO (PERCORRENDO O ARRAY)
         * =================================================================
         */

        System.out.println("--- LOOP CLÁSSICO (FOR) ---");
        // Usamos quando precisamos saber O ÍNDICE atual (ex: para alterar o valor)
        // A propriedade .length retorna o tamanho total do array.
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota no índice " + i + ": " + notas[i]);
        }

        System.out.println("\n--- LOOP ENHANCED (FOR-EACH) ---");
        // Introduzido no Java 5. "Para cada fruta F dentro do array frutas..."
        // Vantagem: Mais limpo e legível.
        // Desvantagem: Não temos acesso ao índice 'i'. Só lemos o valor.
        for (String f : frutas) {
            System.out.println("Fruta: " + f);
        }

        /*
         * =================================================================
         * PARTE 3: O PROBLEMA DA IMPRESSÃO
         * =================================================================
         */
        
        System.out.println("\n--- TENTANDO IMPRIMIR DIRETO ---");
        // Se você tentar imprimir o array diretamente, verá algo como "[I@1b6d3586"
        // Isso é o ENDEREÇO DE MEMÓRIA (Hash), não o conteúdo.
        System.out.println(notas); 

        // A forma correta (usando a classe utilitária Arrays):
        System.out.println("Forma correta: " + Arrays.toString(notas));


        /*
         * =================================================================
         * PARTE 4: MATRIZES (ARRAYS MULTIDIMENSIONAIS)
         * Imagine uma tabela de Excel (Linhas e Colunas).
         * Tecnicamente, é um "Array de Arrays".
         * =================================================================
         */

        // Criando uma matriz 3x3 (3 linhas, 3 colunas)
        int[][] tabuleiro = new int[3][3];

        // Preenchendo a diagonal principal
        tabuleiro[0][0] = 1; 
        tabuleiro[1][1] = 1;
        tabuleiro[2][2] = 1;

        System.out.println("\n--- MATRIZ ---");
        // Para percorrer matrizes, precisamos de Loops Aninhados (Um for dentro do outro)
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                // print (sem ln) para ficar um ao lado do outro
                System.out.print(tabuleiro[linha][coluna] + "  "); 
            }
            System.out.println(); // Pula linha após terminar as colunas daquela linha
        }
    }
}