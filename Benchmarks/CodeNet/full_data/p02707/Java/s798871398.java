import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		int[] ans = new int[N];
		
		A[0] = N;
		for(int i = 1; i < N; i++) {
			A[i] = scan.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(A[i] != N) {
				ans[A[i]-1]++;
			}
		}
		
		
		for(int i = 0; i < N; i++) {
			System.out.println(ans[i]);
		}
	}

}
