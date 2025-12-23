public class Aula02_Operadores {
    public static void main(String[] args) {
        
        // 1. OPERADORES ARITMÉTICOS
        // + (soma), - (subtração), * (multiplicação), / (divisão), % (módulo/resto)
        int a = 10;
        int b = 3;
        
        // Atenção na Divisão de Inteiros: int / int = int (Java joga fora a vírgula)
        int divisaoInteira = a / b; // Resultado é 3, não 3.333
        int restoDivisao = a % b;   // Resultado é 1 (sobra 1 na divisão de 10 por 3)
        
        // Para ter decimais, um dos lados deve ser double/float
        double divisaoReal = (double) a / b; // Agora sim: 3.3333...

        // 2. OPERADORES UNÁRIOS (Incremento e Decremento)
        // ++ soma 1, -- subtrai 1.
        int contador = 0;
        contador++; // vira 1
        
        // A DIFERENÇA VITAL: Pré-fixado vs Pós-fixado
        int x = 10;
        int y = 10;
        
        int teste1 = x++; // Pós: Primeiro ENTREGA o valor (10), DEPOIS soma. teste1 vale 10, x vale 11.
        int teste2 = ++y; // Pré: Primeiro SOMA (vira 11), DEPOIS entrega. teste2 vale 11, y vale 11.
        
        System.out.println("Pós-fixado: " + teste1 + " (Variável original agora é: " + x + ")");
        System.out.println("Pré-fixado: " + teste2);

        // 3. OPERADORES RELACIONAIS (Comparam e retornam boolean)
        // == (igual), != (diferente), > (maior), < (menor), >= (maior igual), <= (menor igual)
        boolean ehIgual = (a == b); // false
        boolean ehDiferente = (a != b); // true

        // 4. OPERADORES LÓGICOS E "CURTO-CIRCUITO"
        // && (E), || (OU), ! (NÃO)
        int idade = 25;
        boolean temIngresso = false;
        
        // Curto-circuito no &&: Se a primeira condição for FALSA, o Java NÃO executa a segunda.
        // Isso economiza processamento e evita erros (como divisão por zero).
        boolean podeEntrar = (idade >= 18) && (temIngresso == true);

        // 5. OPERADOR TERNÁRIO (O "if" de uma linha só)
        // Estrutura: (condição) ? valor_se_verdadeiro : valor_se_falso;
        String status = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";
        
        // 6. OPERADORES DE ATRIBUIÇÃO COMPOSTA
        int valor = 10;
        valor += 5; // Igual a: valor = valor + 5; (15)
        valor *= 2; // Igual a: valor = valor * 2; (30)

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Divisão Inteira: " + divisaoInteira);
        System.out.println("Resto (Módulo): " + restoDivisao);
        System.out.println("Divisão Real: " + divisaoReal);
        System.out.println("Ternário: " + status);
        System.out.println("Atribuição composta: " + valor);
    }
}