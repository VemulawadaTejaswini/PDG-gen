import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] NAB = sc.nextLine().split(" ");

		long N = Long.valueOf(NAB[0]);
		long A = Long.valueOf(NAB[1]);
		long B = Long.valueOf(NAB[2]);
		long Kei = 0;

		long i = 1;
		do {
			if(A * i + B * i < N) {
				i++;
				continue;
			}

			long Zan = 0;
			long Zan_brue = 0;
			Zan = N - A * (i - 1) - B * (i - 1);
			if(Zan <= A) {
				Zan_brue = Zan;
			}else {
				Zan_brue = A;
			}

			Kei = A * (i - 1) + Zan_brue;

			break;


		}while (i <= N);

		System.out.print(Kei);

	}

}