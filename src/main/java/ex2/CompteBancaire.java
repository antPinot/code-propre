package ex2;

/**
 * Représente un compte bancaire de type compte courant (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	/**
	 * Cet attribut est spécifique du Livret A : Pb de conception. Intégrer
	 * l'attribut dans la classe livret A
	 * 
	 * tauxRemuneration : taux de rémunération dans le cas d'un livret A private
	 * double tauxRemuneration;
	 */

	/**
	 * Cet attribut n'a pas lieu d'être : Soit garder le compte courant dans la
	 * classe compte bancaire soit définir compte bancaire comme une classe
	 * abstraite et créer une classe fille compte courant
	 * 
	 * Le type vaut soit CC=Compte courant, ou soit LA=Livret A private String type;
	 */
	
	/**Constructeur implicite
	 * 
	 */
	protected CompteBancaire() {}

	/**Constructeur
	 * @param solde
	 * @param decouvert
	 */
	public CompteBancaire(double solde, double decouvert) {
		// super(); inutile
		// this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Constructeur à créer dans la classe livret A : appeler le constructeur de la
	 * classe mère puis compléter avec les attributs spécifiques de livret A
	 * 
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * 
	 * @param type             = LA
	 * @param solde            représente le solde du compte
	 * @param decouvert        représente le découvert autorisé
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 * 
	 *                         public CompteBancaire(String type, double solde,
	 *                         double decouvert, double tauxRemuneration) { super();
	 *                         this.type = type; this.solde = solde; this.decouvert
	 *                         = decouvert; this.tauxRemuneration =
	 *                         tauxRemuneration; }
	 */

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		setSolde(getSolde() + montant);		// Plutôt utiliser un setter
		// this.solde += montant;		
	}

	/**
	 * Débite un montant au solde si 
	 * le résultat de l'opération est supérieur au découvert
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		// if (type.equals("CC")){
		if (getSolde() - montant > getDecouvert()) {
			setDecouvert(getSolde()- montant); 
		}
		// }
		/*
		 * else if (type.equals("LA")){ if (this.solde - montant > 0){ this.solde =
		 * solde - montant; } }
		 */
	}

	/*
	 * public void appliquerRemuAnnuelle() {
		if (type.equals("LA")) {
			this.solde = solde + solde * tauxRemuneration / 100;
		}
	}*/

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 * 
	 *         public double getTauxRemuneration() { return tauxRemuneration; } /**
	 *         Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 * 
	 *                         public void setTauxRemuneration(double
	 *                         tauxRemuneration) { this.tauxRemuneration =
	 *                         tauxRemuneration; } /** Getter for type
	 * @return the type
	 * 
	 *         public String getType() { return type; } /** Setter
	 * @param type the type to set
	 * 
	 *             public void setType(String type) { this.type = type; }
	 */
}
