package br.com.studiotrek;

public class Telefonista extends Funcionario {
	private Integer ramal;

	public Telefonista(String nome, Double salario, Integer ramal) {
		super(nome, salario);
		this.ramal = ramal;
	}

	public Integer getRamal() {
		return ramal;
	}
	
	@Override
	public void aceite(AtualizadorFuncionario atualizadorFuncionario) {
		atualizadorFuncionario.atualizar(this);
	}
}
