import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long ans = 0;


		for (;;){
			if (M - 2 >= (N + 1) * 2) {
				M = M -2;
				N = N + 1;
			} else {
				break;
			}
		}

		System.out.println(N);
		sc.close();
	}



}

