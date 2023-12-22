import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] v = new int[n];
		Arrays.fill(v, -1);
		
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt() - 1;
			int c = sc.nextInt();
			
			if (v[s] != -1 && v[s] != c) {
				System.out.println(-1);
				sc.close();
				return;
			}
			
			v[s] = c;
		}
		
		if (n > 1 && v[0] == 0) {
			System.out.println(-1);
			sc.close();
			return;
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] > 0 ? v[i] : (i == 0 ? (n == 1 ? 0 : 1) : 0));
		}
		System.out.println();
	}

}
