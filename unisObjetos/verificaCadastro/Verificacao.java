package unisObjetos.verificaCadastro;

import unisObjetos.principal.Cadastro;

public class Verificacao {
	
	public void verifica(Cadastro nome) {
		if (nome.getRegistroProfessor() == 1234 || nome.getNumeroMatricula() == 1234) {
			System.out.println("Registro ou matricula valido.");
		}else {
			System.out.println("Usuario não cadastrdo.");
		}
	}

}
