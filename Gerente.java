public class Gerente extends Funcionario {
    public Gerente(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }
    // Construtor que passa os parâmetros para o construtor da superclasse Funcionario.

    public void realizarReuniao() {
        System.out.println(nome + " está realizando uma reunião.");
    }
    // Imprime uma mensagem indicando que o gerente está conduzindo uma reunião.

    @Override
    public void mostrarDados() {
        System.out.println("Cargo: Gerente");
        super.mostrarDados();
    }
    // Sobrescreve o método da superclasse para exibir o cargo "Gerente" antes das informações gerais do funcionário.
}
