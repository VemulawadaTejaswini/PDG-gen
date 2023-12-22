import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		
		int[] A = new int[N + 2];
		
		for(int i = 1; i <= N + 1; i++) {
			if(i < 100) {
				A[i] = (int)(Math.pow(100, D) * i);
			} else if( i == 101) {
				A[i - 1] = (int)(Math.pow(100, D) * i);
			}
		}
		System.out.println(A[N]);
	}
}
