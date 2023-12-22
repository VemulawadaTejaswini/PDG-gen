import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		int a = teclado.nextInt();
		if (x < a) {
			System.out.println("0");
		}
		
		if (x >= a) {
			System.out.println("10");
		}
		teclado.close();
		
	}
}