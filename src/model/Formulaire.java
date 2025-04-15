package model;

public abstract class Formulaire {
	protected int identificationEntite;
	protected int jour;
	protected int mois;
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}

	public int getIdentificationEntite() {
		return identificationEntite;
	}

	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}	
	
}
