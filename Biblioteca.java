import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Livro> acervo;

    public List<Livro> getAcervo(){
        return acervo;
    }

    public Biblioteca() {
        acervo = new ArrayList<>();
    }
    

    public void adicionarLivro(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o Título: ");
        String titulo = scan.nextLine();
        System.out.println("Digite o nome do autor: ");
        String autor = scan.nextLine();
        System.out.println("Digite o ano de publicação: ");
        int ano = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o numero de paginas: ");
        int paginas = scan.nextInt();
        scan.nextLine();

        if (titulo.isEmpty() || autor.isEmpty()) {
            System.out.println("Título e autor não podem ser vazios.");
            return;
        }

        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Já existe um livro com este título.");
                return;
            }
        }
        Livro novoLivro = new Livro();
        novoLivro.setTitulo(titulo);
        novoLivro.setAutor(autor);
        novoLivro.setAnoPublicacao(ano);
        novoLivro.setNumeroPaginas(paginas);
        acervo.add(novoLivro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void listarLivro() {
        if (acervo.isEmpty()) {
            System.out.println("O acervo está vazio!");
        } else {
            for (int i = 0; i < acervo.size(); i++) {
                System.out.println((i + 1) + ". " + acervo.get(i));
            }
        }
    }

    public void pesquisarLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do livro que deseja pesquisar: ");
        String titulo = scanner.nextLine();
        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado:");
                System.out.println(livro);
                return;
            }
        }
    }

    public void removerLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o titulo do livro que deseja remover: ");
        String titulo = scanner.nextLine();
        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                acervo.remove(livro);
                System.out.println("Livro removido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
