package dados;

public class Departamento {
	private String sigla;
	private String nome;
	private Empregado[] listaEmpregados;
	private Empregado gerente;
	private int numEmpregados;

	public static final int NUM_MAX_EMPREGADOS = 100;

	public Departamento(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
		this.listaEmpregados = new Empregado[NUM_MAX_EMPREGADOS];
		this.numEmpregados = 0;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarEmpregado(Empregado novoEmp) {
		// INSERIR SEU CÓDIGO AQUI. GARANTIR QUE O EMPREGADO IRÁ APONTAR
		// PARA O DEPARTAMENTO NO MOMENTO DE SUA ADIÇÃO
		if (this.numEmpregados == this.NUM_MAX_EMPREGADOS)
			return;
		else {
			for (int i = 0; i < this.numEmpregados; i++) {
				if (this.listaEmpregados[i] == novoEmp)
					return;
			}
			
			this.listaEmpregados[numEmpregados] = novoEmp;
			novoEmp.setDepto(this);
			this.numEmpregados++;

		}
	}

	public void removeEmpregado(Empregado exEmp) {
		// INSERIR SEU CÓDIGO AQUI. GARANTIR QUE O EMPREGADO DEIXARÁ
		// DE APONTAR PARA O DEPARTAMENTO NO MOMENTO DE SUA REMOÇÃO

		for (int i = 0; i <= this.numEmpregados; i++) {
			if (listaEmpregados[i] == exEmp) {
				this.listaEmpregados[i] = this.listaEmpregados[this.numEmpregados-1];
				this.listaEmpregados[this.numEmpregados-1] = null;
				exEmp.setDepto(null);
				this.numEmpregados--;

				return;
			}

		}

	}

	public String toString() {
		String retorno = this.sigla + "-" + this.nome;
		retorno += ": " + this.numEmpregados + " empregados\n";
		for (Empregado e : this.listaEmpregados) {
			if (e != null)
				retorno += e + "\n";
		}
		return retorno;
	}
}
