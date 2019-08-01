package sistema;

public interface SistemaCompanhia extends Sistema {		
	
	@Override
	public abstract void reservaPoltrona(String numPoltrona);
	
	@Override
	public abstract void mostrarOpcoes(String classe, int numPessoas, String posicao);
	
	void cancelaVoo(int numero);
	
	void cadastraVoo(int numero, String horarioIda, String horarioChegada, String cidadeEmbarque,
			double precoEconomica, double precoExecutiva);
	
}
