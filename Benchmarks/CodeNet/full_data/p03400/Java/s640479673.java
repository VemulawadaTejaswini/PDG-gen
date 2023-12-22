import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < 101; j++) {
				if(j * A[i] + 1 <= D) {
					sum++;
				} else {
					break;
				}
			}
		}
		System.out.println(sum + X);
	}
}
