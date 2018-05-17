/**
 * 
 * @author Sergi Valldosera
 * Rebost
 */

public class Pantry {
	private Jam jar1;
	private Jam jar2;
	private Jam jar3;
	private Jam selected;

        /**
         * 
         * @param jar1: primer parametre
         * @param jar2: segon parametre
         * @param jar3: tercer parametre
         */
	Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}
        
        /**
         * Imprimim per pantalla cascuna de les variables
         */
	public void print() {
		System.out.print("1: ");
		jar1.print();
		System.out.print("2: ");
		jar2.print();
		System.out.print("3: ");
		jar3.print();
	}
/**
 * 
 * @param jarNumber: introduim una valor que decidira la variable que queda seleccionada
 */
	public void select(int jarNumber) {
		if (jarNumber == 1) {
			selected = jar1;
		} else if (jarNumber == 2) {
			selected = jar2;
		} else {
			selected = jar3;
		}
	}
/**
 * 
 * @param oz: 'huntem' el valor de la variable amb la variable seleccionada
 */
	public void spread(int oz) {
		selected.spread(oz);
	}
}
