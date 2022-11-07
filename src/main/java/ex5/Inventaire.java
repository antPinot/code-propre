package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author antPinot
 *
 */
public class Inventaire {

	private List<Caisse> caisses;

	/**Constructeur sans paramètre qui 
	 * 
	 */
	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new PetiteCaisse("Petits Objets"));
		caisses.add(new MoyenneCaisse("Moyens objets"));
		caisses.add(new GrandeCaisse("Grands objets"));
	}

	public void addCaisse(Caisse caisse) {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
		caisses.add(caisse);
	}
	
	public void addItems(Item item) {
		for (Caisse caisse : caisses) {
			caisse.filterAndAddItems(item);
		}
	}

	public int getSize(){
		
		//TODO faites évoluer ce code.
		int sizeInventaire = 0;
		for (Caisse caisse : caisses) {
			sizeInventaire += caisse.getSize();
		}
		return sizeInventaire;
	}

	@Override
	public String toString() {
		return "Inventaire [caisses=" + caisses + "]";
	}
	
	
}
