package dados;

public class Empregado {
	private String cpf;
	private String nome;
	private Departamento depto;

	public Empregado(String cpf, String nome, Departamento depto) {
		this.cpf = cpf;
		this.nome = nome;
		this.setDepto(depto);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		// INSERIR SEU C�DIGO AQUI. GARANTIR QUE SE UM DEPARTAMENTO FOR
		// PASSADO, QUE O EMPREGADO IR� APONTAR PARA ESTE DEPARTAMENTO E
		// QUE O DEPARTAMENTO ADICIONAR� O EMPREGADO. GARANTIR TAMB�M
		// QUE SE FOR PASSADO "NULL", O EMPREGADO DEIXAR� DE APONTAR PARA O
		// DEPARTAMENTO ANTIGO E QUE O DEPARTAMENTO REMOVER� O
		// EMPREGADO.

		if(this.depto == depto)
			return;

		if(depto != null){
			
			if(this.depto != null){
				this.depto.removeEmpregado(this);
				this.depto = depto;
			}else{
				if(this.depto == null){
					this.depto = depto;
					this.depto.adicionarEmpregado(this);
				}
			}

		}else{
			
			if(this.depto != null){
				Departamento antigo = this.depto;
				this.depto = null;
				antigo.removeEmpregado(this);
			}
	
		}
	}

	public String toString() {
		String retorno = this.cpf + "-" + this.nome;
		if (this.depto != null)
			retorno += "- alocado no departamento" + this.depto.getNome();
		return retorno;
	}
}
