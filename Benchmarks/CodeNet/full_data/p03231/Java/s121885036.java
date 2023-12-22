import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int M = scan.nextInt();

			String S = scan.next();
			char[]s = S.toCharArray();
			String T = scan.next();
			char[]t = T.toCharArray();

			if(s[0]!=t[0]) {
				System.out.println(-1);
				return;
			}

			int a = s.length;
			int b = t.length;

			int L = lcm(a,b);
			//System.out.println(L);
			int n = L/N;
			int m = L/M;

			//System.out.println(n);
			//System.out.println(m);
			//System.out.println();

			int x = lcm(n,m);
			//System.out.println(x);
			//System.out.println();
			int ok = 1;
			for(int i = x;i<=L;i+=x) {
				int sk =i/n;
				int tk =i/m;

				if(0<=sk&&sk<N&&0<=tk&&tk<=M) {

				//System.out.println(s[sk]);
				//System.out.println(t[tk]);
				//System.out.println();

				if(s[sk]!=t[tk]) {

					ok=0;
					break;
				}
				}

			}

			if(ok==1) {
				System.out.println(lcm(a,b));
			}else {
				System.out.println(-1);
			}









		}


	}

	private static int gcd(int A,int B){//最大公約数
		return B==0?A:gcd (B,A%B);
	}

	private  static int lcm(int A,int B) {//最小公倍数
		return A/gcd(A,B)*B;
	}


}
