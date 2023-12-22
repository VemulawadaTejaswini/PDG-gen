import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for(int i = 0; i < Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		sc.close();
		int[] a = new int[N + 1];
		for(int i = 1; i < N; i++) {
			if(S.charAt(i) == 'C' && S.charAt(i - 1) == 'A') {
				a[i + 1] += a[i] + 1;
			}else {
				a[i + 1] = a[i];
			}
		}
		//a[N] = a[N - 1];
		for(int i = 0; i < Q; i++) {
			System.out.println(a[r[i]] - a[l[i]]);
		}
//		for(int i = 0; i <= N; i++) {
//			System.out.println(i +" " + a[i]);
//		}
	}
}