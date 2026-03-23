//@author gabriel.antunes
import java.util.Scanner;

public class ElevadorMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // valida capacidade
        int capacidadeTotal;
        do {
            System.out.println("Digite a capacidade maxima do elevador:");
            capacidadeTotal = entrada.nextInt();

            if (capacidadeTotal <= 0) {
                System.out.println("Valor invalido, tente de novo.");
            }

        } while (capacidadeTotal <= 0);

        // valida andares
        int andaresTotal;
        do {
            System.out.println("Digite a quantidade de andares do predio:");
            andaresTotal = entrada.nextInt();

            if (andaresTotal <= 0) {
                System.out.println("Valor invalido, tente de novo.");
            }

        } while (andaresTotal <= 0);

        Elevador e1 = new Elevador(capacidadeTotal, andaresTotal);

        int opcaoMenu;

        menu();
        opcaoMenu = entrada.nextInt();

        do {

            if (opcaoMenu == 1) {
                int qtdEntrando;
                do {
                    System.out.println("Informe a Quantidade de Pessoas Entrando:");
                    qtdEntrando = entrada.nextInt();

                    if (qtdEntrando < 0) {
                        System.out.println("Valor invalido, tente de novo.");
                    }

                } while (qtdEntrando < 0);

                e1.entrarPessoas(qtdEntrando);
                pausar(entrada);
            }

            if (opcaoMenu == 2) {
                int qtdSaindo;
                do {
                    System.out.println("Informe a Quantidade de Pessoas Saindo:");
                    qtdSaindo = entrada.nextInt();

                    if (qtdSaindo < 0) {
                        System.out.println("Valor invalido, tente de novo.");
                    }

                } while (qtdSaindo < 0);

                e1.sairPessoas(qtdSaindo);
                pausar(entrada);
            }

            if (opcaoMenu == 3) {
                int qtdSubindo;
                do {
                    System.out.println("Informe a Quantidade de andares a subir:");
                    qtdSubindo = entrada.nextInt();

                    if (qtdSubindo < 0) {
                        System.out.println("Valor invalido, tente de novo.");
                    }

                } while (qtdSubindo < 0);

                e1.subirAndares(qtdSubindo);
                pausar(entrada);
            }

            if (opcaoMenu == 4) {
                int qtdDescendo;
                do {
                    System.out.println("Informe a Quantidade de andares a descer:");
                    qtdDescendo = entrada.nextInt();

                    if (qtdDescendo < 0) {
                        System.out.println("Valor invalido, tente de novo.");
                    }

                } while (qtdDescendo < 0);

                e1.descerAndares(qtdDescendo);
                pausar(entrada);
            }

            if (opcaoMenu == 5) {
                System.out.println("Status Atual:");
                e1.relatorio();
                pausar(entrada);
            }

            if (opcaoMenu < 0 || opcaoMenu > 5) {
                System.out.println("Opção inválida! Tente novamente.");
                pausar(entrada);
            }

            menu();
            opcaoMenu = entrada.nextInt();

        } while (opcaoMenu != 0);

        System.out.println("FIM DO PROGRAMA!");
        entrada.close();
    }

    private static void menu() {
        System.out.println("\n=== MENU ===");
        System.out.println("0 - Encerrar o programa");
        System.out.println("1 - Entrar pessoas no elevador");
        System.out.println("2 - Sair pessoas do elevador");
        System.out.println("3 - Subir andares");
        System.out.println("4 - Descer andares");
        System.out.println("5 - Relatório");
        System.out.println("");
        System.out.println("");
        System.out.print("Escolha uma opção: ");
        System.out.println("");
    }

    private static void pausar(Scanner entrada) {
        System.out.println("\nPressione ENTER para continuar...");
        entrada.nextLine();
        entrada.nextLine();
    }
}
