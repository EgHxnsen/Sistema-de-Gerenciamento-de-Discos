import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              List<Disco> discos = new ArrayList<>();

              while (true) {
                     System.out.println("Escolha uma opção:");
                     System.out.println("1. Adicionar Disco");
                     System.out.println("2. Remover Disco");
                     System.out.println("3. Listar Discos");
                     System.out.println("4. Sair");
                     int opcao = scanner.nextInt();
                     scanner.nextLine(); // Consumir a nova linha

                     if (opcao == 1) {
                            System.out.println("Digite o nome do disco:");
                            String nome = scanner.nextLine();
                            System.out.println("Digite o nome do artista:");
                            String artista = scanner.nextLine();
                            System.out.println("Digite o gênero:");
                            String genero = scanner.nextLine();
                            System.out.println("Digite o ano de lançamento:");
                            int anoLancamento = scanner.nextInt();
                            System.out.println("Digite a quantidade em estoque:");
                            int quantidadeEstoque = scanner.nextInt();
                            System.out.println("Digite o preço:");
                            double preco = scanner.nextDouble();
                            scanner.nextLine(); // Consumir a nova linha

                            Disco disco = new Disco(nome, artista, genero, anoLancamento, quantidadeEstoque, preco);
                            discos.add(disco);
                            System.out.println("Disco adicionado com sucesso!");

                     } else if (opcao == 2) {
                            System.out.println("Digite o nome do disco a ser removido:");
                            String nome = scanner.nextLine();
                            discos.removeIf(disco -> disco.getNome().equalsIgnoreCase(nome));
                            System.out.println("Disco removido com sucesso!");

                     } else if (opcao == 3) {
                            System.out.println("Lista de Discos:");
                            for (Disco disco : discos) {
                                   System.out.println(disco);
                            }

                     } else if (opcao == 4) {
                            System.out.println("Saindo...");
                            break;

                     } else {
                            System.out.println("Opção inválida. Tente novamente.");
                     }
              }

              scanner.close();
       }
}