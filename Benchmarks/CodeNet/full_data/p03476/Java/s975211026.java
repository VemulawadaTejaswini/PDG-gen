import java.util.*;

public class Main {
	
	static int p[] = new int[100001];
	
	public static void create() {
		p[0] = -1;
		p[1] = -1;
		p[2] = 1;
		for(int i = 2; i < p.length; ++i) {
			if(p[i] != -1) {
				p[i] = 1;
				for(int j = 2; j * i < p.length; ++j) {
					p[i * j] = -1;
				}
			}
		}
	}
	
	public static boolean judge(int x) {
		if(p[x] != 1)return false;
		int tmp = (x + 1) / 2;
		if(p[tmp] != 1)return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int ans[] = new int[100001];
		create();
		for (int i = 1; i < ans.length; ++i) {
			ans[i] = ans[i - 1];
			if(judge(i))ans[i]++;
		}
		for(int i = 0; i < q; ++i) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int a = ans[r] - ans[l - 1];
			System.out.println(a);
		}
		sc.close();
	}

}
