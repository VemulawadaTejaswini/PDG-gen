import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		if(n == 1) {
			int val = 0;
			if(m > 0) {
				in.nextInt();
				int prev = in.nextInt();
				boolean flag = true;
				for(int i = 0; i < m - 1; i++) {
					in.nextInt();
					if(in.nextInt() != prev) {
						flag = false;
						break;
					}
				}
				if(flag == true) val = prev;
				else val = -1;
			}
			System.out.println(val);
		}else {
			int[] ans = new int[n];
			boolean[] flag = new boolean[n];
			for(int i = 0; i < m; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				x -= 1;
				if(flag[x] == false) {
					if((x == 0) && (y == 0)) {
						ans[x] = -1;
						break;
					}
					ans[x] = y;
					flag[x] = true;
				}else {
					if(ans[x] != y) {
						ans[0] = -1;
						break;
					}
				}
			}
			if(ans[0] == -1) {
				System.out.println("-1");
			}else {
				if(ans[0] == 0) ans[0] = 1;
				for(int i = 0; i < n; i++) {
					System.out.print(ans[i]);
				}
				System.out.print("\n");
			}
		}
	}
} 