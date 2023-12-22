import java.util.Scanner;
public class Main {

	private static int N;
	private static int M;
	private static String S;
	private static String T;
	private static int L;
	private static String[] SS;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = 3;
		M = 2;
		S = "acp";
		T = "ae";
		L = (int)(lcm((long)N, (long)M));
		SS = new String[L];

		insert(N,S);
		insert(M,T);

	    for (String s : SS) {
	    	String ls = s==null ? "t" : s;
	        System.out.print(ls);
	    }
	    sc.close();
	}

    private static void insert(int x,String z) {
		int p = 0;
		for(int i=0;i<x;i++) {


			if(SS[p] == null) {
				SS[p] = z.substring(i, i+1);
			}else if(!SS[p].equals(z.substring(i, i+1))) {
				System.out.println(-1);
				System.exit(0);
			}
			p += L/x;
		}
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
