package Atividade;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d1 = new Desktop();
		Desktop d2 = new Desktop();
		Desktop d3 = new Desktop();
		d1.setFabricante("Positivo");
		d1.setCodBarras(5062937841l);
		d1.setGamer(true);
		ArrayList<String> pecasdobalacobaco1 = new ArrayList<>();
		pecasdobalacobaco1.add("Cooler");
		pecasdobalacobaco1.add("SSD");
		d2.setFabricante("Microsoft");
		d2.setCodBarras(6391048275l);
		d2.setGamer(false);
		ArrayList<String> pecasdobalacobaco2 = new ArrayList<>();
		d2.setFabricante("Apple");
		d2.setCodBarras(6217840953l);
		d2.setGamer(false);
		ArrayList<String> pecasdobalacobaco3 = new ArrayList<>();
		ArrayList<Desktop> listaDesktop = new ArrayList<>();
		
		Smartphone s1 = new Smartphone();
		Smartphone s2 = new Smartphone();
		Smartphone s3 = new Smartphone();
		s1.setFabricante("Marca Motorola");
		s1.setCodBarras(6480172953l);
		s1.setDimensoesTela("Tela de 6,5 Polegadas");
		s1.setCor("Cor Roxa");
		s2.setFabricante("Marca Samsung");
		s2.setCodBarras(7162845390l);
		s2.setDimensoesTela("Tela de 7,5 Polegadas");
		s2.setCor("Cor Vermelha");
		s3.setFabricante("Marca Xiaomi");
		s3.setCodBarras(4837295610l);
		s3.setDimensoesTela("Tela de 7 Polegadas");
		s3.setCor("Cor Azul");
		ArrayList<Smartphone> listaSmartphone = new ArrayList<>();
		listaDesktop.add(d1);
		listaDesktop.add(d2);
		listaDesktop.add(d3);
		listaSmartphone.add(s1);
		listaSmartphone.add(s2);
		listaSmartphone.add(s3);
		System.out.println("Smartphones:");
		System.out.println("");
		for (Smartphone smartphone : listaSmartphone) {
			System.out.println(smartphone.getFabricante());
			System.out.println("Código "+smartphone.getCodBarras());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getCor());
			System.out.println("");
		}
		
	}

}
