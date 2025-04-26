import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Cria um objeto Scanner para ler entradas do usuário.
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        // Cria uma lista para armazenar objetos do tipo Funcionario.

        while (true) {
            // Inicia um loop infinito para exibir o menu até que o usuário escolha sair.
            
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Exibir Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            // Exibe o menu com opções para o usuário.
            
            int opcao = input.nextInt();
            // Lê a opção escolhida pelo usuário.
            
            input.nextLine();
            // Limpa o buffer do Scanner para evitar problemas ao ler strings.

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }
            // Se a opção for 0, exibe mensagem de saída e interrompe o loop.

            else if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = input.nextLine();
                // Solicita e lê o nome do funcionário.

                System.out.print("Salário: ");
                double salario = input.nextDouble();
                input.nextLine();
                // Solicita e lê o salário, limpando o buffer após a leitura.

                System.out.print("Departamento: ");
                String departamento = input.nextLine();
                // Solicita e lê o departamento.

                System.out.print("CPF: ");
                String cpf = input.nextLine();
                // Solicita e lê o CPF.

                System.out.print("Data de nascimento (dd/mm/aaaa): ");
                String dataNascimento = input.nextLine();
                // Solicita e lê a data de nascimento.

                System.out.println("Tipo de funcionário:");
                System.out.println("1 - Gerente");
                System.out.println("2 - Desenvolvedor");
                System.out.println("3 - Estagiário");
                System.out.print("Escolha: ");
                int tipo = input.nextInt();
                input.nextLine();
                // Exibe opções de tipo de funcionário, lê a escolha e limpa o buffer.

                Funcionario f = null;
                // Declara uma variável para armazenar o novo funcionário.

                if (tipo == 1) {
                    f = new Gerente(nome, salario, departamento, cpf, dataNascimento);
                } else if (tipo == 2) {
                    f = new Desenvolvedor(nome, salario, departamento, cpf, dataNascimento);
                } else if (tipo == 3) {
                    f = new Estagiario(nome, salario, departamento, cpf, dataNascimento);
                } else {
                    System.out.println("Tipo inválido!");
                    continue;
                }
                // Cria um objeto do tipo correspondente (Gerente, Desenvolvedor ou Estagiário) com base na escolha; se inválido, exibe erro e continua o loop.

                funcionarios.add(f);
                // Adiciona o novo funcionário à lista.

                System.out.println("Funcionário cadastrado com sucesso!");
                // Exibe mensagem de confirmação.
            }

            else if (opcao == 2) {
                if (funcionarios.isEmpty()) {
                    System.out.println("Nenhum funcionário cadastrado.");
                }
                // Verifica se a lista está vazia; se estiver, exibe mensagem.

                else {
                    for (Funcionario f : funcionarios) {
                        f.mostrarDados();
                        // Exibe os dados do funcionário.

                        f.baterPonto();
                        // Registra o ponto do funcionário.

                        if (f instanceof Gerente) {
                            ((Gerente) f).realizarReuniao();
                        } else if (f instanceof Desenvolvedor) {
                            ((Desenvolvedor) f).programar();
                        } else if (f instanceof Estagiario) {
                            ((Estagiario) f).fazerTarefa();
                        }
                        // Verifica o tipo do funcionário e executa a ação específica (reunião, programar ou tarefa).

                        System.out.println("-------------------------");
                        // Imprime uma linha separadora entre os funcionários.
                    }
                }
            }

            else {
                System.out.println("Opção inválida!");
            }
            // Se a opção não for válida, exibe mensagem de erro.
        }

        input.close();
        // Fecha o Scanner para liberar recursos.
    }
}