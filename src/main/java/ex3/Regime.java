/**
 * 
 */
package ex3;

/**
 * Enumération contenant les 3 types de régimes possibles pour un animal 
 * @author antPinot
 *
 */
public enum Regime {
	
	//Régime Carnivore
	CARNIVORE("Carnivore"),
	//Régime Omnivore
	OMNIVORE("Omnivore"),
	//Régime Herbivore
	HERBIVORE("Herbivore");
	
	//Libellé du régime
	private String libelle;

	/**Constructeur privé de Regime
	 * @param libelle
	 */
	private Regime(String libelle) {
		this.libelle = libelle;
	}

	/**Getter pour l'attribut libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**Setter pour l'attribut libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
