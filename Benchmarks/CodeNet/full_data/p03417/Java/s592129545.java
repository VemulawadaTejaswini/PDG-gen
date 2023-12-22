import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		if(N == 1 && M == 1) {
			System.out.println(1);
			return;
		} else if(N == 1 && 1 < M) {
			System.out.println(M-2);
			return;
		} else if(M == 1 && 1 < N) {
			System.out.println(N-2);
			return;
		} else{
			System.out.println((N-2)*(M-2));
			return;
		}
	}
}