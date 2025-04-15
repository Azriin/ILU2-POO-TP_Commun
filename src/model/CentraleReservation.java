package model;

public class CentraleReservation <P extends Reservation>{
	private Reservation[] listReservations;
	private int nbReservations = 0;
	
		
	public int ajouterEntite(P reservation) {
		listReservations[nbReservations++] = reservation;
		return nbReservations;
	}
	
	public int[] donnerPossibilites(Formulaire form){
		int[] lstEntite = new int[listReservations.length];
		for (int i = 0; i < lstEntite.length; i++) {
			if (listReservations[i].)
		}
		
		return lstEntite;
	}
}
