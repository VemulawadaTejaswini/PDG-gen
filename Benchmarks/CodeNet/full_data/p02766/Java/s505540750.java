import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N  = sc.nextInt();
		int K  = sc.nextInt();

		for (int i = 0;; i++) {

			if(N <= (int)Math.pow(K, i) ) {
				System.out.println(i);
				break;
			}
		}
	}
}