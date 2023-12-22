import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] A = new int[N + 2];
		A[0] = 0;
		A[N + 1] = 0;
		
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		
		int[] d = new int[N + 2];
		int D = 0;
		
		for(int i = 1; i <= N + 1; i++) {
			d[i] = A[i] - A[i - 1];
			D += Math.abs(d[i]);
		}
		
		int money = 0;
		
		for(int i = 1; i <= N; i++) {
			money = D - Math.abs(d[i]) - Math.abs(d[i + 1]) + Math.abs(d[i] + d[i + 1]);
			System.out.println(money);
		}
		
	}
}
