import java.util.Scanner;

public class URI_1036 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int numeroLanche = sc.nextInt();
		int quantidadeLanche = sc.nextInt();
		double Valor;
		if ( numeroLanche == 1 ) {
			Valor = 4.0 * quantidadeLanche;
			System.out.printf("Total: R$ %.2f%n", Valor);
		} else if( numeroLanche == 2  ) {
			Valor = 4.5 * quantidadeLanche;
			System.out.printf("Total: R$ %.2f%n", Valor);
		} else if ( numeroLanche == 3  ) {
			Valor = 5.0 * quantidadeLanche;
			System.out.printf("Total: R$ %.2f%n", Valor);
		} else if ( numeroLanche == 4  ) {
			Valor = 2.0 * quantidadeLanche;
			System.out.printf("Total: R$ %.2f%n", Valor);
		} else if ( numeroLanche == 5  ) {
			Valor = 1.5 * quantidadeLanche;
			System.out.printf("Total: R$ %.2f%n", Valor);
		}
		sc.close();
	}
}