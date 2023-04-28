package unisObjetos.principal;

public class Cadastro {

	private String nome;
	private int idade;
	private int numeroMatricula;
	protected int registroProfessor;
	
	
	
	

	public int getRegistroProfessor() {
		return registroProfessor;
	}

	public void setRegistroProfessor(int registroProfessor) {
		this.registroProfessor = registroProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public void fichaCadastral() {
		System.out.println("Nome do aluno ou professor: "+ getNome());
		System.out.println("Idade: " + getIdade());
		
	}

}
