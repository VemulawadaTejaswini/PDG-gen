import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int total = A * N;
		if (total <= B) {
			System.out.println(total);
		}
		
		else {
			System.out.println(B);
		}
		
		teclado.close();
		
	}
}