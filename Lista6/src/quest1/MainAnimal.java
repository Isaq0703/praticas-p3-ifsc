package quest1;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro doguinho = new Cachorro();
		doguinho.setCor("Preto");
		doguinho.setNpatas(4);
		doguinho.setComprimento((float) 0.8);
		doguinho.setEcossistema("meu quintal");
		doguinho.setRaca("Pinscher");
		doguinho.late();
		doguinho.caminha();
		
		Gato cato = new Gato();
		cato.setCor("Cinza");
		cato.setNpatas(4);
		cato.setComprimento((float)0.5);
		cato.setEcossistema("minha casa");
		cato.setRaca("American Shorthair");
		cato.mia();
		cato.caminha();
		System.out.println("");
		System.out.println(doguinho.getRaca());
		System.out.println(doguinho.getCor());
		System.out.println(doguinho.getNpatas());
		System.out.println(doguinho.getComprimento());
		System.out.println(doguinho.getEcossistema());
		System.out.println("");
		System.out.println(cato.getRaca());
		System.out.println(cato.getCor());
		System.out.println(cato.getNpatas());
		System.out.println(cato.getComprimento());
		System.out.println(cato.getEcossistema());
	}

}
