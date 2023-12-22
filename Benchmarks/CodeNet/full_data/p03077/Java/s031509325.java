import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		double[] N = new double[6];
		N[0] = sc.nextDouble();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();

		int time = 1;

		for (;; time++) {
			if (N[4] != 0) {
				N[4] -= E;
				N[5] += E;
			}
			if (N[3] > 1) {
				N[3] -= D;
				N[4] += D;
			}
			if (N[2] > 1) {
				N[2] -= C;
				N[3] += C;
			}
			if (N[1] > 1) {
				N[1] -= B;
				N[2] += B;
			}
			if (N[0] > 1) {
				N[0] -= A;
				N[1] += A;
			}

//			System.out.print(N[0] + "  ");
//			System.out.print(N[1] + "  ");
//			System.out.print(N[2] + "  ");
//			System.out.print(N[3] + "  ");
//			System.out.print(N[4] + "  ");
//			System.out.println(N[5] + "  ");

			if (N[0] < 1 && N[1] < 1 && N[2] < 1 && N[3] < 1 && N[4] < 1) {
				break;
			}
		}

		System.out.println(time);
	}
}