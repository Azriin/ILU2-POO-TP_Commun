package model;


public class Table extends EntiteReservable<FormulaireRestaurant> {
	private int nbChaises;
	private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();
	
	public Table(int nbChaise) {
		super();
		this.nbChaises = nbChaise;
	}
	
	@Override
	public boolean compatible(FormulaireRestaurant form) {
		if (!(form instanceof FormulaireRestaurant)) {
			return false;
		}
		return (form.getNombrePersonnes() == nbChaises || form.getNombrePersonnes() == nbChaises+1) && 
			((form.getNumService() == 1 && estLibre(form)) || (form.getNumService() == 2 && calendrierDeuxiemeService.estLibre(form.getJour(), form.getMois())));
	} 

	@Override
	public Reservation reserver(FormulaireRestaurant form) {
		if (compatible(form)) {
			return new ReservationRestaurant(form.getJour(), form.getMois(), form.getNumService(), form.getIdentificationEntite());
		} 
		return null;
	}

}
