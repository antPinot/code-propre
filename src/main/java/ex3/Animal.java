package ex3;

/**
 * Représente le concept d'Animal
 * @author antPinot
 *
 */
public class Animal {
	
	//Type de l'animal : Ex mammifère
	private String type;
	//Nom de l'animal
	private String nom;
	//Type de régime : Enumération Regime 
	private Regime regime;

	/**Constructeur
	 * @param type
	 * @param nom
	 * @param regime
	 */
	public Animal(String type, String nom, Regime regime) {
		this.type = type;
		this.nom = nom;
		this.regime = regime;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", nom=" + nom + ", regime=" + regime + "]";
	}

	/**Getter pour l'attribut type
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**Setter pour l'attribut type
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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

	/**Getter pour l'attribut regime
	 * @return the regime
	 */
	public Regime getRegime() {
		return regime;
	}

	/**Setter pour l'attribut regime
	 * @param regime the regime to set
	 */
	public void setRegime(Regime regime) {
		this.regime = regime;
	}
	

}
