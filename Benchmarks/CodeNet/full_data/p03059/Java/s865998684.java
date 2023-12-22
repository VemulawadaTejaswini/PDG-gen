import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double A = sc.nextDouble();
		int B = sc.nextInt();
		Double T = sc.nextDouble();
		sc.close();
		int a = (int)((T+0.5)/A);
		System.out.println(a*B);
	}

}