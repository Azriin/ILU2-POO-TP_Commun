package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel calendrier;
	private int numero;
	
	public int getNumero() {
		return numero;
	}
		
	public EntiteReservable() {
		this.calendrier = new CalendrierAnnuel();
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(F form) {
		return calendrier.estLibre(form.getJour(), form.getMois());
	}
	
	public abstract boolean compatible(F form);
	
	public abstract Reservation reserver(F form);

}
