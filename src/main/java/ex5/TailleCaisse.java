/**
 * 
 */
package ex5;

/**
 * @author antPinot
 *
 */
public enum TailleCaisse {
	
	PETIT("Petit"),
	MOYEN("Moyen"),
	GRAND("Grand");
	
	private String libelle;

	/**Constructeur
	 * @param libelle
	 */
	private TailleCaisse(String libelle) {
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
