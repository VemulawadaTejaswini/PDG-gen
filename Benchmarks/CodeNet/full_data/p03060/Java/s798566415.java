import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];
		int[] ans = new int[N];
		for (int i=0;i<N;i++) {
			V[i]=sc.nextInt();
		}
		for (int i=0;i<N;i++) {
			C[i]=sc.nextInt();
		}
		for (int i=0;i<N;i++) {
			ans[i]=Math.max(0,V[i]-C[i]);
		}
		int sum=0;
		for (int i=0;i<N;i++) {
			sum+=ans[i];
		}
		System.out.println(sum);
	}
}