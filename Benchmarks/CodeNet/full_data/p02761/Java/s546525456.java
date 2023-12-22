import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] r = new int[n];
		int[] s = new int[m];
		int[] c = new int[m];
		boolean[] flag = new boolean[n];
		for(int i = 0; i < m; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
			if(!flag[s[i]-1]) {
				r[s[i]-1] = c[i];
				flag[s[i]-1] = true;
			}else if(r[s[i]-1] != c[i]) {
				System.out.println("-1");
				System.exit(0);
			}
			if(s[i] == 1 && c[i] == 0) {
				System.out.println("-1");
				System.exit(0);
			}
		}
		if(!flag[0])r[0] = 1;
		for(int i = 0; i < n; i++) {
			System.out.print(r[i]);
		}
		System.out.println();
	}

}
