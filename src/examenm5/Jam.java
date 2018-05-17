/**
 * 
 * @author Sergi Valldosera
 */
public class Jam {
	private String contents;
	private String date;
	private int capacity;
	private static int numTotalJars, noJam = 0;
/**
 * 
 * @param contents: inicialitzem variable amb un valor que ens pasen
 * @param date: inicialitzem variable amb un valor que ens pasen
 * @param size: : inicialitzem variable amb un valor que ens pasen
 */
	Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
		numTotalJars++;
	}
/**
 * 
 * @return si el Jam esta buit tornem true, sino false
 */
	public boolean empty() {
		return (capacity == 0);
	}
/**
 * Imprimim per pantalla
 */
	public void print() {
		System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
		System.out.println("El n�mero total de Jars creats des de l'inici dels temps s�n: " + Jam.getNumTotalJars());
		System.out.println("El n�mero de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
	}
/**
 * 
 * @param fluidOz: numero dejam que hi ha ala Jar
 */
	public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz < capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
				capacity = 0;
				noJam++;			}
		} else {
			System.out.println("No jam in the Jar!");
		}
	}
/**
 * 
 * @return el numero total de Jars
 */
	public static int getNumTotalJars() {
		return numTotalJars;
	}
/**
 * 
 * @return el numero de jam plenes
 */
	public static int getNoJam() {
		return noJam;
	}
}
