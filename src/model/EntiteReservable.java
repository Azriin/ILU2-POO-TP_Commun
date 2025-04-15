package model;

public abstract class EntiteReservable {
	private CalendrierAnnuel calendrier;
	private int numero;
	
	public EntiteReservable(CalendrierAnnuel calendrier, int numero) {
		this.calendrier = calendrier;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(Formulaire form) {
		return calendrier.estLibre(form.getJour(), form.getMois());
	}
	
	public abstract boolean compatible(Formulaire form);
	
	public abstract Reservation reserver(Formulaire form);
}
