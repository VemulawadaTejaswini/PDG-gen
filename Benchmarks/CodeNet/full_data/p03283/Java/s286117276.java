import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int Q = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		for(int i = 0; i < m; i++) {
			l[i] = sc.nextInt();;
			r[i] = sc.nextInt();
		}
		int[] p = new int[Q];
		int[] q = new int[Q];
		for(int i = 0; i < Q; i++) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
		}
		for(int i = 0; i < Q; i++) {
			int num = 0;
			for(int j = 0; j < m; j++) {
				if(p[i] <= l[j] && r[j] <= q[i])num++;
			}
			System.out.println(num);
		}
	}

}