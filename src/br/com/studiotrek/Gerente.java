package br.com.studiotrek;

public class Gerente extends Funcionario {

	private String senha;
	
	public Gerente(String nome, Double salario, String senha) {
		super(nome, salario);
		this.senha = senha;
	}

	public String getSenha() {
		return this.senha;
	}
	
	@Override
	public void aceite(AtualizadorFuncionario atualizadorFuncionario) {
		atualizadorFuncionario.atualizar(this);
	}
	
}
