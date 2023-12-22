import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		boolean result = false;

		long ans = N;
		for (int i=1; i<=Math.sqrt(N); i++){
			if (N % i == 0){
				long tmp = (i - 1) + ((N / i) - 1);
				ans = Math.min(ans, tmp);
			}
		}
		System.out.println(ans);
	}

}