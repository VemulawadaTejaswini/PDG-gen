import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 1;

		for (int i=0; i<N; i++){
			if (ans < K){
				ans = ans * 2;
			} else {
				ans = ans + K;
			}
		}
		System.out.println(ans);
	}
}
