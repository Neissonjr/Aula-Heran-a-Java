package equipe;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("BMW", "330i", 2022, 4);
		Moto moto = new Moto("Honda", "CB500", 2021, 250);

		List<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(carro);
		veiculos.add(moto);

		System.out.println("Demonstração dos veículos:");
		for (Veiculo v : veiculos) {
			System.out.println(v);
			v.acelerar();
			v.frear();
			System.out.println();
		}
	}

}