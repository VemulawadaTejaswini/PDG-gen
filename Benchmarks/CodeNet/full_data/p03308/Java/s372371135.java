import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int ans = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if(ans<Math.abs(A[i]-A[j])){
					ans=Math.abs(A[i]-A[j]);
				}
			}
		}
		System.out.println(ans);
		sc.close();

	}
}
