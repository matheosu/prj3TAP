package controle;

import dados.*;

public class Programa {
	public static void main(String[] args) {
		Departamento d1 = new Departamento("RH", "Recursos Humanos");
		Departamento d2 = new Departamento("JR", "JURÍDICO");
		Empregado e1 = new Empregado("123-4", "José da Silva", d1);
		Empregado e2 = new Empregado("567-8", "Maria de Souza", d1);
		Empregado e3 = new Empregado("901-2", "Pedro Antunes", d2);

		System.out.println(d1);
		System.out.println(d2);

		System.out.println("\nTirando o " + e1.getNome() + " do depertamento");
		e1.setDepto(null);

		System.out.println(d1);
		System.out.println(d2);

		System.out.println("\nColocando o " + e1.getNome() + " no depertamento " + d2.getNome());
		e1.setDepto(d2);
		
		System.out.println(d1);
		System.out.println(d2);

		System.out.println("\nAdicionando o " + e3.getNome() + " no depertamento " + d1.getNome());
		d1.adicionarEmpregado(e3);

		System.out.println(d1);
		System.out.println(d2);

	}
}
