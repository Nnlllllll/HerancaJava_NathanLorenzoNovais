public class Funcionario extends Pessoa {
    String nome;
    double salario;
    String departamento;
    // Define os atributos nome, salario e departamento específicos de um funcionário.

    public Funcionario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(cpf, dataNascimento);
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }
    // Construtor que inicializa os atributos da superclasse Pessoa (cpf, dataNascimento) e os atributos locais (nome, salario, departamento).

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
    // Exibe as informações do funcionário, incluindo nome, salário, departamento, CPF e data de nascimento.

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }
    // Imprime uma mensagem indicando que o funcionário registrou seu ponto.
}