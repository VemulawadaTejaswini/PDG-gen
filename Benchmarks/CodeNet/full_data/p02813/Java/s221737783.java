import java.util.Scanner;

public class Main {
	static int p;
	static int q;
	static int n;
	static int a = -1;
	static int b = -1;
	static int cnt = 0;
	
	static void dfs(String v) {
		if (v.length() == n) {
//			System.out.print(v);
			cnt++;
			if (Integer.valueOf(v) == p) {
				a = cnt;
//				System.out.printf(" a cnt=%d", cnt);
			}
			if (Integer.valueOf(v) == q) {
				b = cnt;
//				System.out.printf(" b cnt=%d", cnt);
			}
//			System.out.println();
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (v.contains(Integer.toString(i))) {
				continue;
			}
			String nv = v + i;
			dfs(nv);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		p = sc.nextInt();
		for (int i = 1; i < n; i++) {
			p = p * 10 + sc.nextInt();
		}
		
		q = sc.nextInt();
		for (int i = 1; i < n; i++) {
			q = q * 10 + sc.nextInt();
		}
		
//		System.out.printf("p=%d\n", p);
//		System.out.printf("q=%d\n", q);
		
		for (int i = 1; i <= n; i++) {
			dfs(Integer.toString(i));
		}
		
		int ans = Math.abs(a - b);
		System.out.println(ans);
	}
}
