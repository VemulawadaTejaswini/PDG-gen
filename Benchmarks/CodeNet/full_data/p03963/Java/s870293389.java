import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int a = K;
		for (int i = 1; i < N; i++) {
			a *= K-1;
		}
		System.out.println(a);
		sc.close();
	}
}
