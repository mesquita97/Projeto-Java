package cliente;

import sistema.SistemaUsuario;

public class Passageiro implements SistemaUsuario {
	String nome, cpf;
	int idade;
	
	public Passageiro(String nome, String cpf, int idade) {
		this.nome=nome;
		this.cpf=cpf;
		this.idade=idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public void reservaPoltrona(String numPoltrona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarOpcoes(String classe, int numPessoas, String posicao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String buscaVoos(String destino) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void comprar(int numeroVoo, String formaDePagamento) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
