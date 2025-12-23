public class Aula01_TiposPrimitivos {
    public static void main(String[] args) {
        /*
         * =================================================================
         * PARTE 1: NÚMEROS INTEIROS (Sem casas decimais)
         * O Java possui 4 tipos para inteiros, variando pelo espaço em memória (bits).
         * =================================================================
         */

        // 1. byte: O menor tipo.
        // Tamanho: 8 bits (1 byte). Vai de -128 a 127.
        // Uso: Economia extrema de memória ou processamento de arquivos binários/imagens.
        byte diasNoMes = 31;
        // byte erro = 130; // ERRO DE COMPILAÇÃO: 130 não cabe em 8 bits.

        // 2. short: Inteiro curto.
        // Tamanho: 16 bits. Vai de -32.768 a 32.767.
        // Uso: Pouco usado hoje em dia, pois a arquitetura dos processadores modernos prefere int.
        short anoAtual = 2025;

        // 3. int: O padrão do Java.
        // Tamanho: 32 bits. Vai de -2 bilhões a +2 bilhões (aprox).
        // Se você digita um número solto no código (ex: 10), o Java assume que é int.
        int populacaoCidade = 1500000;

        // 4. long: Inteiro longo.
        // Tamanho: 64 bits. Vai de -9 quintilhões a +9 quintilhões.
        // Uso: IDs de banco de dados, contagem de milissegundos, dados científicos.
        // ATENÇÃO: É obrigatório colocar o sufixo 'L' no final, senão o Java acha que é int.
        long populacaoMundial = 8_000_000_000L; // O underline (_) serve apenas para leitura humana.

        /*
         * =================================================================
         * PARTE 2: PONTO FLUTUANTE (Números Reais / Com vírgula)
         * O Java segue o padrão IEEE 754.
         * =================================================================
         */

        // 5. float: Precisão simples.
        // Tamanho: 32 bits.
        // ATENÇÃO: Obrigatório o sufixo 'f' ou 'F'. Sem isso, o Java assume que é double.
        // Uso: Motores gráficos (Unity/OpenGL) onde velocidade importa mais que precisão exata.
        float notaProva = 9.5f;

        // 6. double: Precisão dupla (O padrão do Java).
        // Tamanho: 64 bits. Muito mais preciso que o float.
        // Uso: Cálculos matemáticos, salários, engenharia.
        double precoProduto = 199.99;

        /*
         * =================================================================
         * PARTE 3: CARACTERES E BOOLEANOS
         * =================================================================
         */

        // 7. char: Um único caractere Unicode.
        // Tamanho: 16 bits.
        // ATENÇÃO: Usa aspas SIMPLES (' ').
        // Curiosidade: O char, no fundo, é um número positivo. A letra 'A' é o número 65.
        char letraTurma = 'B';
        char codigoASCII = 65; // Isso imprimirá a letra 'A'.

        // 8. boolean: Lógica pura.
        // Tamanho: Não definido precisamente pela especificação (depende da JVM), geralmente 1 bit lógico.
        // Valores possíveis: APENAS true ou false. (Não aceita 0 ou 1 como em C++).
        boolean sistemaAtivo = true;

        /*
         * =================================================================
         * PARTE 4: CASTING (Conversão de Tipos)
         * Hierarquia: byte -> short -> int -> long -> float -> double
         * =================================================================
         */

        // Conversão Implícita (Widening): Do menor para o maior. É segura e automática.
        int numeroPequeno = 100;
        double numeroGrande = numeroPequeno; // O int 100 vira double 100.0 automaticamente.

        // Conversão Explícita (Narrowing): Do maior para o menor. PERIGOSA.
        // Você precisa forçar (Cast) e assume o risco de perder dados.
        double valorQuebrado = 9.99;
        int valorInteiro = (int) valorQuebrado; // PERDA DE DADOS: Vira 9 (não arredonda, trunca).

        // Estouro de tipo (Overflow)
        // O que acontece se somarmos 1 ao valor máximo do int?
        int maximo = 2147483647; // Máximo int possível
        int estourado = maximo + 1; // Vira -2147483648 (Dá a volta para o negativo!)

        // --- IMPRESSÃO DOS RESULTADOS ---
        System.out.println("--- TIPOS PRIMITIVOS ---");
        System.out.println("Long (População): " + populacaoMundial);
        System.out.println("Char via número (65): " + codigoASCII);
        System.out.println("Casting (9.99 -> int): " + valorInteiro);
        System.out.println("Overflow (Max + 1): " + estourado);
    }
}