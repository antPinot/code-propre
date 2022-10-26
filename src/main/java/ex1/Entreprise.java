package ex1;

import java.util.Date;

/**
 * @author antPinot
 * 
 * Cette méthode abstraite décrit le concept d'Entreprise
 *
 */
public abstract class Entreprise {

	//Attribut donnant le n° SIRET 
	private int siret;

	//Attribut donnant le nom
	private String nom;

	//Attribut donnant l'adresse
	private String adresse;

	//Attribut donnant la date de création
	private Date dateCreation;
	

	//Attribut (constante) donnant le capital maximum d'une entreprise
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * Méthode abstraite qui affiche le statut et ne renvoie rien
	 * 
	 */
	public abstract void Afficher_statut();

	/**Getter pour l'attribut siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**Setter pour l'attribut siret
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter pour l'attribut adresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**Setter pour l'attribut adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**Getter pour l'attribut dateCreation
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**Setter pour l'attribut dateCreation
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**Getter pour l'attribut capitalMax
	 * @return the capitalMax
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
	
	
}
