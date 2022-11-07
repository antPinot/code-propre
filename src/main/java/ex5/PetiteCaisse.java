package ex5;

import java.util.ArrayList;

public class PetiteCaisse extends Caisse {

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public PetiteCaisse(String nom) {
		super(nom);
		this.items = new ArrayList<>();
	}

	@Override
	public void filterAndAddItems(Item item) {
		if (item.getPoids() < 5) {
			this.items.add(item);
		}
	}

}
