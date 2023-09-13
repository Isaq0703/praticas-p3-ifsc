package Quest1;

import java.util.ArrayList;

public class VeiculoMain {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		v1.setAno("2015");
		v1.setCor("preto");
		v1.setFabricante("Honda");
		v1.setNome("Civic");
		v1.setNumeroRodas("4 rodas");
		
		Veiculo v2 = new Veiculo();
		v2.setAno("1985");
		v2.setCor("verde");
		v2.setFabricante("Nielson");
		v2.setNome("Diplomata 350");
		v2.setNumeroRodas("6 rodas");
		
		Veiculo v3 = new Veiculo();
		v3.setAno("2019");
		v3.setCor("azul");
		v3.setFabricante("Kawasaki");
		v3.setNome("KLX110");
		v3.setNumeroRodas("2 rodas");
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		veiculos.add(v1);
		veiculos.add(v2);
		veiculos.add(v3);
		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getNumeroRodas());
			System.out.println("");
			
		}
	}

}
