package ex5;

import java.util.ArrayList;

public class MoyenneCaisse extends Caisse {
	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public MoyenneCaisse(String nom) {
		super(nom);
		this.items = new ArrayList<>();
	}

	@Override
	public void filterAndAddItems(Item item) {
		if (item.getPoids() >= 5 && item.getPoids() <= 20) {
			this.items.add(item);
		}

	}
}
