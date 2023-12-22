import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int A = sc.nextInt();
		int P = sc.nextInt();

		double peace = P;

		if(A > 0){
			peace = peace + (A * 3);
		}

				System.out.println(String.format("%,d", ((int) Math.floor(peace) / 2 )));

		sc.close();
	}
}
