import java.util.Scanner;
/**
 * @version v1.0
 * @author emozo
 * @see <p>Para más información ver <a href="www.google.com">Google</a></p>
 */


public class FuncionSuma {
	/**
	 * Variable para guardar el primer sumando
	 */
	
	private static int primerSumando;
	/**
	 * Variable para guardar el segundo sumando
	 */
	private static int segundoSumando; 
	/**
	 * Función principal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
	/**
	 * Función que realiza la suma
	 * @param sumando1
	 * @param sumando2
	 * @return
	 */
	
	
	private static int suma (int sumando1, int sumando2) {
		return sumando1-sumando2;
	}

}
