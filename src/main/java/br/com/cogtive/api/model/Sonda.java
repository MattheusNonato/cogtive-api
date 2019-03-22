package br.com.cogtive.api.model;

public class Sonda {
	
	private Posicao posicao;
	private Planalto planalto;
	private DirecaoCardinal direcaoCardinal;
	private String entrada;
	
	public Sonda(Posicao posicao, DirecaoCardinal direcaoCardinal, Planalto planalto) {
		this.posicao = posicao;
		this.direcaoCardinal = direcaoCardinal;
		this.planalto = planalto;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public DirecaoCardinal getDirecaoCardinal() {
		return direcaoCardinal;
	}

	public void setDirecaoCardinal(DirecaoCardinal direcaoCardinal) {
		this.direcaoCardinal = direcaoCardinal;
	}

	public Planalto getPlanalto() {
		return planalto;
	}

	public void setPlanalto(Planalto planalto) {
		this.planalto = planalto;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
}
