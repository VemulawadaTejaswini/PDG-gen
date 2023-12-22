import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N=teclado.nextInt();
		double A=teclado.nextDouble();
		double B=teclado.nextDouble();
		if(A*N>B) {
			System.out.println(B);
		}else {
			System.out.println(A*N);
		}
        teclado.close();
	}

}
