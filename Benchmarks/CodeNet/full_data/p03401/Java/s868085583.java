import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int[]dA = new int[N - 1];
		for(int i = 0; i < N - 1; i++) {
			dA[i] = Math.abs(A[i] - A[i + 1]);
		}
		int sum = 0;
		for(int i = 0; i < N - 1; i++) {
			sum += dA[i];
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int t;
			if(i == 0) {
				t = Math.abs(A[1]);
			}else {
				t = Math.abs(A[0]);
			}
			if(i != N - 1) {
				t += Math.abs(A[N - 1]);
			}else {
				t += Math.abs(A[N - 2]);
			}
			if(i == 0) {
				t += sum - dA[0];
			}else if(i == N - 1){
				t += sum - dA[N - 2];
			}else {
				t += sum + Math.abs(A[i - 1] - A[i + 1])- dA[i] - dA[i - 1];
			}
			sb.append(t).append("\n");
		}
		System.out.print(sb.toString());
	}
}