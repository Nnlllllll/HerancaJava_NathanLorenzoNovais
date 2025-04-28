public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }
    // Construtor que passa os parâmetros para o construtor da superclasse Funcionario.

    public void programar() {
        System.out.println(nome + " está programando.");
    }
    // Imprime uma mensagem indicando que o desenvolvedor está realizando uma tarefa de programação.
    @Override
    public void mostrarDados() {
        System.out.println("Cargo: Desenvolvedor");
        super.mostrarDados();
    }
    // Sobrescreve o método da superclasse para exibir o cargo "Desenvolvedor" antes das informações gerais do funcionário.
}
