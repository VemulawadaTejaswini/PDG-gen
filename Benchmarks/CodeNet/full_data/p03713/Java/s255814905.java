import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		sc.close();
		out.println(Math.min(diff_min(h, w), diff_min(w, h)));
//		for (i = 2; i <= 100; i++) {
//			for (j = 2; j <= 100000; j++) {
//				out.printf("%d %d ", i ,j);
//				out.println(Math.min(diff_min(i, j), diff_min(j, i)));
//			}
//		}
	}
	public static int diff_min(int a, int b) {
		int ans = 100000;
		int hmod = a % 3; 
		if(hmod == 0) {
			ans = 0;
		} else {
			int a3 = a / 3;
			int b2 = b / 2;
			if(b % 2 == 0) {
				ans = b2;
			} else if(hmod == 1){
				ans = Math.min(Math.min(Math.max(a3+b2*2+1, a3*2), Math.max(a3*2+1, b2 + a3 + 1)),b);
//				out.printf("%d %d %d %d%n",a3+b2*2+1, a3*2, a3*2+1, b2 + a3 + 1);
			} else {
				ans = Math.min(Math.min(Math.max(a3*2+2, a3+b2*2+2), Math.max(a3*2+1, b2 + a3 + 1)),b);
//				out.printf("%d %d %d %d%n",a3*2+2, a3+b2*2+2, a3*2+1, b2 + a3 + 1);
			}
		}
		return ans;
	}
}
