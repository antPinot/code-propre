/**
 * 
 */
package ex5;

import java.util.ArrayList;

/**
 * @author antPinot
 *
 */
public class GrandeCaisse extends Caisse {
	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public GrandeCaisse(String nom) {
		super(nom);
		this.items = new ArrayList<>();
	}

	@Override
	public void filterAndAddItems(Item item) {
		if (item.getPoids() >= 20) {
			this.items.add(item);
		}

	}
}
