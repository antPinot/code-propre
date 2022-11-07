package ex5;

import java.util.ArrayList;
import java.util.List;

public abstract class Caisse {

	protected String nom;
	protected List<Item> items;
	
	
	/**Constructeur
	 * @param nom
	 * @param items
	 * @param taille
	 */
	public Caisse(String nom) {
		this.nom = nom;
		this.items = new ArrayList<>();
	}

	public abstract void filterAndAddItems(Item item);
	
	public int getSize(){
		int sizeCaisse = 0;
		for (Item item : items ) {
			sizeCaisse += item.getPoids();
		}
		return sizeCaisse;
	}

	@Override
	public String toString() {
		return "Caisse [nom=" + nom + ", items=" + items + "]";
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
