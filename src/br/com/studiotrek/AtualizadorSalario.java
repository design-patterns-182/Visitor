package br.com.studiotrek;

public class AtualizadorSalario implements AtualizadorFuncionario {

	@Override
	public void atualizar(Gerente gerente) {
		gerente.setSalario(gerente.getSalario() * 1.45);
	}

	@Override
	public void atualizar(Telefonista telefonista) {
		telefonista.setSalario(telefonista.getSalario() * 1.12);
	}

}
