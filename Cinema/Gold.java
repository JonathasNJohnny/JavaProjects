package Cinema;

public class Gold extends Ingresso {
	private static final double DESCONTO = 0.08;

	public Gold(String data, String nome, String sala, String hora, double valor) {
		super(data, nome, sala, hora, valor);
	}
	
	@Override
	public double imprimeValor(){
		return getValor() * (1.00 - DESCONTO);
	}
}
