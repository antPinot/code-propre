package ex5;

public class Application {

	public static void main(String[] args) {

		Inventaire inventaire = new Inventaire();
		
		inventaire.addItems(new Item("Sabre Laser", 4));
		
		System.out.println(inventaire);
		
		System.out.println(inventaire.getSize());
		
	}
}