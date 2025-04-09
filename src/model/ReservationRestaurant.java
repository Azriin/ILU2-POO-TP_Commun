package model;

public class ReservationRestaurant extends Reservation{
	private int service;
	private int table;
	
	
	public ReservationRestaurant(int jour, int mois, int service, int table) {
		super.jour = jour;
		super.mois = mois;
		this.service = service;
		this.table = table;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Le ");
		s.append(jour);
		s.append("/");
		s.append(mois);
		s.append("\nTable ");
		s.append(table);
		s.append(" pour le ");
		if (service == 1) {
			s.append("premier ");
		} else {
			s.append("deuxième ");
		}
		s.append("service.\n");
		return s.toString();
	}
	
}
