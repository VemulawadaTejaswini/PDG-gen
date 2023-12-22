import java.util.*;

public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();

		long INF = Long.MAX_VALUE/2;
		long ans = INF;
		for(int i=1;i<h+1;i++) {
			
			long s[] = new long[3];
			
			//vertical
			s[0] = (long)i * w;
			s[1] = ((long)h - i) * (w/2);
			s[2] = ((long)h - i) * (w-w/2);
			Arrays.sort(s);
			long res = s[2]-s[0];
			ans = Math.min(ans, res);
			
			//horizon
			int th = (h - i)/2;
			s[0] = (long)i * w;
			s[1] = ((long)th) * w;
			s[2] = ((long)h - i - th) * w;
			Arrays.sort(s);
			res = s[2]-s[0];
			ans = Math.min(ans, res);
		}
		
		//hとwをスワップ
		int tmp = h;
		h = w;
		w = tmp;
		
		for(int i=1;i<h+1;i++) {
			
			long s[] = new long[3];
			
			//vertical
			s[0] = (long)i * w;
			s[1] = ((long)h - i) * (w/2);
			s[2] = ((long)h - i) * (w-w/2);
			Arrays.sort(s);
			long res = s[2]-s[0];
			ans = Math.min(ans, res);
			
			//horizon
			int th = (h - i)/2;
			s[0] = (long)i * w;
			s[1] = ((long)th) * w;
			s[2] = ((long)h - i - th) * w;
			Arrays.sort(s);
			res = s[2]-s[0];
			ans = Math.min(ans, res);
		}
		System.out.println(ans);
	}
}