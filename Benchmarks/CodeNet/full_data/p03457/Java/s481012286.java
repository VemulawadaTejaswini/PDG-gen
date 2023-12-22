import java.util.*;
import java.util.stream.*;

public class Main{
	public static void main(String... args){ new Main().solve(); }

	public void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pt = 0;
		int px = 0;
		int py = 0;
		int ct = 0;
		int cx = 0;
		int cy = 0;
		int condition[][] = new int[n][2];
		for(int i=0; i<n; i++){
			ct = sc.nextInt();
			cx = sc.nextInt();
			cy = sc.nextInt();
			condition[i][0] = ct - pt;
			condition[i][1] = Math.abs(cx - px) + Math.abs(cy - py);
			pt = ct;
			px = cx;
			py = cy;
		}
		long cnt = Arrays.asList(condition).stream()
			.filter(a -> {
				if((a[0] % 2) == (a[1] % 2) && a[0] >= a[1]) return true;
				return false;
			})
			.count();
		if(cnt == n) System.out.println("Yes");
		else System.out.println("No");
	}
}

