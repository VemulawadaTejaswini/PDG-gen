import java. util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] h = new int[N];

		for (int i=0; i<N; i++) {
			h[i] = sc.nextInt();
		}

		for(int i=0; i<N-1; i++) {
			for(int j=N-1; j>i; j--) {
				if(h[j-1] > h[j]) {
					int t = h[j-1];
					h[j-1] = h[j];
					h[j] =t;

				}

			}
		}

		int answer = 1000000000;

		for(int i=0; i<K; i++) {
			if(answer > (h[i+K-1] - h[i]))
			answer =  h[i+K-1] - h[i];

		}
System.out.print(answer);

	}

}
