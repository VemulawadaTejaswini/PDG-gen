import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] T = new int[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
			sum += T[i];
		}
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int P = sc.nextInt(), X = sc.nextInt();
			System.out.println(sum - T[P - 1] + X);
		}
	}
}