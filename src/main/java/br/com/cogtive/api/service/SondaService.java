package br.com.cogtive.api.service;

import org.springframework.stereotype.Service;

import br.com.cogtive.api.model.DirecaoCardinal;
import br.com.cogtive.api.model.Posicao;
import br.com.cogtive.api.model.Sonda;

@Service
public class SondaService {

	public void iniciaProcessamento(Sonda sonda) {
		
		for (int i = 0; i < sonda.getEntrada().length(); i++) {

			String c = String.valueOf(sonda.getEntrada().charAt(i));

			switch (c.toUpperCase()) {
			case "L":
				moveSondaEsquerda(sonda);
				break;
			case "R":
				moveSondaDireita(sonda);
				break;
			case "M":
				moveParaFrente(sonda);
				break;
			}
		}

	}

	public void moveParaFrente(Sonda sonda) {
		if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.N)) {
			sonda.setPosicao(new Posicao(sonda.getPosicao().getX(), sonda.getPosicao().getY() + 1));
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.S)) {
			sonda.setPosicao(new Posicao(sonda.getPosicao().getX(), sonda.getPosicao().getY() - 1));
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.E)) {
			sonda.setPosicao(new Posicao(sonda.getPosicao().getX() + 1, sonda.getPosicao().getY()));
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.W)) {
			sonda.setPosicao(new Posicao(sonda.getPosicao().getX() - 1, sonda.getPosicao().getY()));
		}
	}

	private void moveSondaDireita(Sonda sonda) {
		if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.N)) {
			sonda.setDirecaoCardinal(DirecaoCardinal.E);
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.E)) {
			sonda.setDirecaoCardinal(DirecaoCardinal.S);
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.S)) {
			sonda.setDirecaoCardinal(DirecaoCardinal.W);
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.W)) {
			sonda.setDirecaoCardinal(DirecaoCardinal.N);
		}
	}

	private void moveSondaEsquerda(Sonda sonda) {
		if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.N)) {
			sonda.setDirecaoCardinal(DirecaoCardinal.W);
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.W)) {
			sonda.setDirecaoCardinal(DirecaoCardinal.S);
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.S)) {
			sonda.setDirecaoCardinal(DirecaoCardinal.E);
		} else if (sonda.getDirecaoCardinal().equals(DirecaoCardinal.E)) {
			sonda.setDirecaoCardinal(DirecaoCardinal.N);
		}
	}

}
