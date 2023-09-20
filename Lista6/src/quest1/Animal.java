package quest1;

public class Animal {
private String nome;
private String raca;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}
public String cor;
public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getEcossistema() {
	return ecossistema;
}

public void setEcossistema(String ecossistema) {
	this.ecossistema = ecossistema;
}

public Float getComprimento() {
	return comprimento;
}

public void setComprimento(Float comprimento) {
	this.comprimento = comprimento;
}

public Integer getNpatas() {
	return npatas;
}

public void setNpatas(Integer npatas) {
	this.npatas = npatas;
}
public String ecossistema;
public Float comprimento;
public Integer npatas;
public void caminha(){
	System.out.println("CAMINHANDO");
}
}
