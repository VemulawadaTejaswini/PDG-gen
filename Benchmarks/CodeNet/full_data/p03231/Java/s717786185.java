import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		String S = sc.next();
		String T = sc.next();
		
		int num = (int)lcm(N, M);
		
		boolean flag = true;
		int cnt = 0;
		while(flag) {
			flag = false;
			cnt++;
			num *= cnt;
			if(cnt > 1) {
				num = -1;
				break;
			}
			String str[] = new String[10000000];
			Arrays.fill(str, "#");
			int n_num = num / N;
			int m_num = num / M;
			for(int i = 0; i < N; i++) {
				str[i * n_num + 1] = S.substring(i, i + 1);
			}
			for(int i = 0; i < M; i++) {
				if(!str[i * m_num + 1].equals("#") && !str[i * m_num + 1].equals(T.substring(i, i + 1))) {
					flag = true;
				}
			}
		}
		System.out.println(num);
	}
	
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
	
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
