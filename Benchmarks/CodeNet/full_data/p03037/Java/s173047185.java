import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for(int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}

		int ok = 0;

		for(int i =1; i<=N; i++) {
			boolean isOk = true;
			for(int k = 0; k < M; k++)
				if(i < L[k]  || R[k] < i) {
					isOk = false;
					break;
				}
			if(isOk == true) ok++;


		}

		System.out.println(ok);


	}

}