import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		int[] res = new int[N+1];
		for (int i=0; i<M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for (int i=0; i<M; i++) {
			res[a[i]]++;
			res[b[i]]++;
		}
		for (int i=1; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
