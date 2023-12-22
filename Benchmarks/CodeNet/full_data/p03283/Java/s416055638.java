import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		
		int[] L = new int[M];
		int[] R = new int[M];
		for (int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		
		int[] p = new int[Q];
		int[] q = new int[Q];
		for (int i = 0; i < Q; i++) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
		}
		
		int count;
		for (int i = 0; i < Q; i++) {
			count = 0;
			for (int j = 0; j < M; j++) {
				if (L[j] >= p[i] && R[j] <= q[i])
					count++;
			}
			System.out.println(count);
		}
	}
}