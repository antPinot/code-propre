package ex2;

public class LivretA extends CompteBancaire {

	// tauxRemuneration : le taux de rémunération annuelle, spécifique au livret A
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		this.solde = solde;
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void ajouterMontant(double montant) {
		super.ajouterMontant(montant);
	}

	@Override
	/*
	 * Redéfinition de la méthode debiterMontant de la classe CompteBancaire
	 * La condition contrôle ici que le résultat de l'opération est strictement positif
	 */
	public void debiterMontant(double montant) {
		if (getSolde() - montant > 0){ 
			setSolde(getSolde()- montant);
		}
	}

	/**
	 * Méthode fixant le nouveau solde après application du taux de rémunération annuelle
	 */
	public void appliquerRemuAnnuelle() {
		setSolde(getSolde() + getSolde() * getTauxRemuneration() / 100);
	}

	/**
	 * Getter pour l'attribut tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter pour l'attribut tauxRemuneration
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
