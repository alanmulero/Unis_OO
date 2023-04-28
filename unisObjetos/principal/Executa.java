package unisObjetos.principal;

import unisObjetos.verificaCadastro.Verificacao;

public class Executa {

	public static void main(String[] args) {

		// Instanciando aluno

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alan");
		aluno1.setIdade(53);
		aluno1.setNota1(10);
		aluno1.setNota2(8);
		aluno1.setNota3(5);
		aluno1.setNumeroMatricula(12);
		aluno1.fichaCadastral();
		
		// Instanciando professor
		
		Professor professor = new Professor();
		professor.setNome("Maria");
		professor.setIdade(35);
		professor.setRegistroProfessor(1234);
		professor.fichaCadastral();
		
		
		// Instanciando Verificação
		
		Verificacao verificacao = new Verificacao();
		verificacao.verifica(professor);
		verificacao.verifica(aluno1);

	}

}
