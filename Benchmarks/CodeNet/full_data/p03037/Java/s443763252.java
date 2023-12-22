import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] L = new int[m];
		int[] R = new int[m];
		for(int i = 0; i < m; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		int[] id = new int[n+1];
		for(int i = 0; i < m; i++) {
			for(int j = L[i]; j <= R[i]; j++) {
				id[j] ++;
			}
		}
		int ans = 0;
		for(int i = 0; i <= n; i++) {
			if(id[i] == m) {
				ans ++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
