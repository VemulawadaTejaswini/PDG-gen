import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partC101();
	}


	public static void partC101() {
		Scanner scC = new Scanner(System.in);
		int N = scC.nextInt();
		int K = scC.nextInt();
		BigDecimal Nb = new BigDecimal(N);
		BigDecimal Kb = new BigDecimal(K - 1);
		int[] A = new int[N];

		for(int i = 0 ; i < N ; i++) {
			A[i] = scC.nextInt();
		}

		if(N == K) {
			System.out.println("1");
		}else if(K == 2) {
			System.out.println(N - 1);
		}else if(N % (K - 1) == 1) {
			System.out.println(N / (K - 1));
		}else {
			BigDecimal X = Nb.divide(Kb);
			BigDecimal Y = X.setScale(0, BigDecimal.ROUND_UP);
			System.out.println(Y);
		}
	}
}