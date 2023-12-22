import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] r = new int[n];
		int[] s = new int[m];
		int[] c = new int[m];
		for(int i = 0; i < m; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
			if(r[s[i]-1] == 0)r[s[i]-1] = c[i];
			else if(r[s[i]-1] != c[i]) {
				System.out.println("-1");
				System.exit(0);
			}else if(s[i] == 1 && c[i] == 0) {
				System.out.println("-1");
				System.exit(0);
			}
		}
		boolean flag = false;
		for(int i = 0; i < m; i++) {
			if(s[i] ==1)flag = true;
		}
		if(!flag)r[0] = 1;
		for(int i = 0; i < n; i++) {
			System.out.print(r[i]);
		}
		System.out.println();
	}

}
