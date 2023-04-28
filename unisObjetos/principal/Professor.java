package unisObjetos.principal;

public class Professor extends Cadastro {
	
	

	public int getRegistroProfessor() {
		return super.registroProfessor;
	}

	public void setRegistroProfessor(int registroProfessor) {
		super.registroProfessor = registroProfessor;
	}

	@Override
	public void fichaCadastral() {
		// TODO Auto-generated method stub
		System.out.println();
		super.fichaCadastral();
		System.out.println("Númeo do registro do professor: "+ getRegistroProfessor());
	}
}
