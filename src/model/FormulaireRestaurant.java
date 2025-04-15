package model;

public class FormulaireRestaurant extends Formulaire{
	private int nombrePersonnes;
	private int numService;
	
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super.jour = jour;
		super.mois = mois;
		this.nombrePersonnes = nbPersonnes;
		this.numService = numService;
	}

	public Integer getNombrePersonnes() {
		return nombrePersonnes;
	}

	public Integer getNumService() {
		return numService;
	}

}
