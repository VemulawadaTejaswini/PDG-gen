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

		AA = B + C;
		BB = A + C;
		CC = A + B;
		A = AA;
		B = BB;
		C = CC;
/*
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
		*/
		//答えの絶対値が10の18乗を超える
		if (Math.abs(A-B) > Math.pow(10, 18)) {
			System.out.println("Unfair");
		}
		else if (K % 2 == 1) {
			System.out.println(A - B);
		}
		else if(K % 2 == 0) {
			System.out.println(-(A - B));
		}

	}

}