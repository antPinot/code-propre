package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente le concept de Zoo 
 * @author antPinot
 *
 */
public class Zoo {

	//Nom du zoo
	private String nom;
	//Liste des animaux qui composent le Zoo
	private List<Animal> animaux;
	/*private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	*/
	
	/**Constructeur primaire
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.animaux = new ArrayList<>();
	}
	
	/**Constructeur secondaire
	 * @param nom
	 * @param animaux
	 */
	public Zoo(String nom, List<Animal> animaux) {
		this.nom = nom;
		this.animaux = animaux;
	}
	
	/**
	 * Méthode pour ajouter un animal à la liste des animaux du Zoo
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}

	/**
	 * Méthode pour afficher la liste des animaux du Zoo
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}
	
	/**
	 * @return
	 */
	public int taille() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter pour l'attribut animaux
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/**Setter pour l'attribut animaux
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	
}
