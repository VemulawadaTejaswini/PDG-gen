import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int max = nCk(n-1,2,1000000007);
		if(max<k) System.out.println(-1);
		else {
			StringBuilder sb = new StringBuilder();
			String ls = System.lineSeparator();
			int add_count = max-k;
			sb.append(n-1+add_count);
			sb.append(ls);
			for(int i=2;i<=n;i++) {
				sb.append(1 + " " + i);
				sb.append(ls);
			}
			int l = 2;
			int r = 3;
			for(int i=0;i<add_count;i++) {
				sb.append(l + " " + r);
				sb.append(ls);
				if(r==n) {
					l++;
					r = l+1;
				}else {
					r++;
				}
			}
			System.out.println(sb.toString());
		}
		in.close();

	}

	
	//return a^b mod M O(logB)
	public static long pow(long a,long b,int M) {
		long ret = 1;
		long tmp = a;
		while(b>0) {
			if((b&1)==1) ret = (ret * tmp) % M;
			tmp = (tmp * tmp) % M;
			b = b>>1;
		}
		return ret;
	}
	
	//return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
	public static int nCk(int n,int k,int M) {
		long ret = 1;
		int min = Math.min(k, n-k);
		for(int i=1;i<=min;i++) {
			ret = (ret * pow(i,M-2,M)) % M;
		}
		for(int i=n-min+1;i<=n;i++) {
			ret = (ret * i) % M;
		}
		return (int)ret;
	}
}
