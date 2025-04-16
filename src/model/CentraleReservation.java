package model;

public class CentraleReservation <E extends EntiteReservable<Formulaire>, F extends Formulaire>{
	private E[] listReservations;
	private int nbReservations = 0;
	
		
	public int ajouterEntite(E reservation) {
		listReservations[nbReservations++] = reservation;
		return nbReservations;
	}
	
	public int[] donnerPossibilites(F form){
		int[] lstEntite = new int[listReservations.length];
		for (int i = 0; i < lstEntite.length; i++) {
			if ((listReservations[i]).compatible(form)) {
				lstEntite[i] = form.getIdentificationEntite();
			} else {
				lstEntite[i] = 0;
			}
		}
		return lstEntite;
	}
	
	public Reservation reserver(int num, F form) {
		for (E entite : listReservations) {
			if (entite != null && entite.getNumero() == num) {
				form.setIdentificationEntite(listReservations[num].getNumero());
				return entite.reserver(form);
			}
		}
		return null;
	}
	
}
