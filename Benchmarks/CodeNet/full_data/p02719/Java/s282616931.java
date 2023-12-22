import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long K = sc.nextLong();

		if (N == 0) {System.out.print(0);}
		if (K == 1) {System.out.print(0);}

		long Min = N;

		do {

			if (N < Min) {
				Min = N;
			}

			N = Math.abs(K - N);


		} while (Min != N);

		System.out.print(Min);

	return;

	}
}
