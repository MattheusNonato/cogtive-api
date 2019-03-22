package br.com.cogtive.api.model;

public enum DirecaoCardinal {
	 N("Norte"),
     E("Leste"),
     S("Sul"),
     W("Oeste");
     
     private String chave;
     
     DirecaoCardinal(String chave) {
    	 this.chave = chave;
     }

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}
}
