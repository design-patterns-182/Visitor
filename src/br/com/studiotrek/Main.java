package br.com.studiotrek;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Departamento> lista = new ArrayList<Departamento>();

		Departamento departamento = new Departamento("Departamento 1");
		Gerente gerente = new Gerente("Gerente 1", 1500.0, "1234");
		Telefonista telefonista = new Telefonista("Telefonista", 1000.0, 10);

		departamento.getFuncionarios().add(gerente);
		departamento.getFuncionarios().add(telefonista);

		lista.add(departamento);

		AtualizadorFuncionario atualizadorFuncionario = new AtualizadorSalario();

		for (Departamento d : lista) {
			d.aceite(atualizadorFuncionario);
		}

		for (Departamento d : lista) {
			for (Funcionario funcionario : d.getFuncionarios()) {
				System.out.println("Nome: " + funcionario.getNome() + " - Salario: " + funcionario.getSalario());
			}
		}

	}

}
