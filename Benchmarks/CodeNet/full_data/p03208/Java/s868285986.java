import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] h = new int[N];
			for (int i=0;i<N;i++) {
				h[i]=sc.nextInt();
			}
			Arrays.sort(h);

			int A=N-K+1;
			int[] dif = new int[A];
			for (int i=0;i<A;i++) {
				dif[i]=h[K-1+i]-h[i];
			}
			Arrays.sort(dif);
			System.out.println(dif[0]);
	}
}