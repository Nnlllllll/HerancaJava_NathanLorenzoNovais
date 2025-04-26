public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }
    // Construtor que passa os parâmetros para o construtor da superclasse Funcionario.

    public void fazerTarefa() {
        System.out.println(nome + " está fazendo uma tarefa.");
    }
    // Imprime uma mensagem indicando que o estagiário está executando uma tarefa.

    
    public void mostrarDados() {
        System.out.println("Cargo: Estagiário");
        super.mostrarDados();
    }
    // Sobrescreve o método da superclasse para exibir o cargo "Estagiário" antes das informações gerais do funcionário.
}