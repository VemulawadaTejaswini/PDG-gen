import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long AA = 0;
		long BB = 0;
		long CC = 0;

		for(int i = 0; i < K; i++) {

			if((A == B) && (B == C) && (C == A)) {
				break;
			}
			AA = B + C;
			BB = A + C;
			CC = A + B;
			A = AA;
			B = BB;
			C = CC;

			if (Math.abs(A - B) > Math.pow(10, 18)) {
				break;
			}

		}

		if (Math.abs(A - B) > Math.pow(10, 18)) {
			System.out.println("Unfair");
		}else {
			System.out.println(A - B);
		}

	}

}
