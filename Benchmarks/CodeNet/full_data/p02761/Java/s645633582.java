import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] num = new int[n];
		String ans = "";
		boolean flag = false;
		for(int i = 0; i < m; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			x -= 1;
			if((x == 0) && (y == 0)) {
				ans = "-1";
				break;
			}
			if(num[x] != 0) {
				if(num[x] != y) {
					ans = "-1";
					break;
				}else {
					num[x] = y;
				}
			}else {
				if(x == 0) flag = true;
				num[x] = y;
			}
		}
		if(!ans.equals("-1")) {
			if(flag == false) num[0] = 1;
			for(int i = 0; i < n; i++) {
				ans += num[i];
			}
		}
		System.out.println(ans);
	}
} 
