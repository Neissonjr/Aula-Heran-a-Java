package equipe;

public class Moto extends Veiculo {
    private int cilindradas;

	public Moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public void acelerar() {
		System.out.println(getMarca() + " é uma marca de moto que acelera rápido!");
	}

	@Override
	public String toString() {
		return super.toString() + " - Moto com "+ cilindradas + " cilindradas";
	}
}