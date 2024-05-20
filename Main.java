import java.util.Scanner;

public class Main {
    private static Biblioteca biblioteca = new Biblioteca();
    
    public static void main(String[] args) {
        Biblioteca acervo = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar um novo livro ao acervo.");
            System.out.println("2 - Listar todos os livros no acervo.");
            System.out.println("3 - Pesquisar um livro no acervo pelo título.");
            System.out.println("4 - Remover um livro do acervo.");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    acervo.adicionarLivro();
                    break;
                case "2":
                    acervo.listarLivro();
                    break;
                case "3":
                    acervo.pesquisarLivro();
                    break;
                case "4":
                    acervo.removerLivro();
                    break;
                case "0":
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }


    }    
}