public class Aula03_ControleFluxo {
    public static void main(String[] args) {
        
        // 1. IF-ELSE ENCADEADO (Clássico)
        int hora = 14;
        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        // 2. SWITCH-CASE (Para múltiplas escolhas de valor exato)
        // É mais rápido que múltiplos if-else para verificar uma única variável.
        // Funciona com int, char, String e Enum.
        int opcaoMenu = 2;

        switch (opcaoMenu) {
            case 1:
                System.out.println("Iniciando Jogo...");
                break; // O BREAK É OBRIGATÓRIO (senão ele executa o case 2 também - isso se chama 'fall-through')
            case 2:
                System.out.println("Carregando Configurações...");
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default: // O 'else' do switch
                System.out.println("Opção Inválida");
        }

        // 3. ESTRUTURAS DE REPETIÇÃO (LOOPS)

        // A. WHILE (Enquanto) - Verifica, DEPOIS executa.
        // Pode rodar 0 vezes se a condição já começar falsa.
        int i = 10;
        while (i < 5) {
            System.out.println("Isso nunca será impresso.");
        }

        // B. DO-WHILE (Faça... Enquanto) - Executa, DEPOIS verifica.
        // Garante que o código rode PELA MENOS UMA VEZ.
        // Muito usado em menus: "Mostre o menu, depois verifique se o usuário quer sair".
        do {
            System.out.println("Executou o Do-While pelo menos uma vez.");
        } while (i < 5);

        // C. FOR (Para) - Controle total (Início; Condição; Passo)
        // break: Mata o loop imediatamente.
        // continue: Pula apenas a volta atual e vai para a próxima.
        System.out.println("\n--- LOOP FOR COM CONTROLE ---");
        for (int k = 0; k < 10; k++) {
            if (k == 2) {
                System.out.println("Pulando o 2 (continue)");
                continue; 
            }
            if (k == 5) {
                System.out.println("Parando no 5 (break)");
                break;
            }
            System.out.println("Contador: " + k);
        }
    }
}