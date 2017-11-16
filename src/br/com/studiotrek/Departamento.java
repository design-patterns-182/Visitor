package br.com.studiotrek;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nome;
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public Departamento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void aceite(AtualizadorFuncionario atualizadorFuncionario) {
		for (Funcionario funcionario : funcionarios) {
			funcionario.aceite(atualizadorFuncionario);
		}
	}

}
