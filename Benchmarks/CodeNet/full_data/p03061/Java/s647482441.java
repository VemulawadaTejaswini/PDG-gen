
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static int n;
	static int[] A;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    n=gi();
	    A=new int[n];
	    for(int i=0; i<n;i++) {
	    	A[i]=gi();
	    }

	    int a=g(0, n-1, 0);
//	    if (s>x) {
//	    	System.out.println(n-1);
//	    } else {
//	    	Arrays.parallelSort(a);
//
//	    	System.out.println(c);
//	    }
	    System.out.println(a);
	}

	public static int g(int l, int r, int m) {
        if(r-l<1) return m;
		int l1=l;
		int r1=Math.floorDiv((l+r),2);
		int l2=r1+1;
		int r2=r;
		int u1=f(l1, r1, m);
		int u2=f(l2, r2, m);
		if(u1>u2) {
			return g(l2, r2, u1);
		} else if(u1<u2) {
			return g(l1, r1, u2);
		} else {
			return u1;
		}
	}

	public static int f(int l, int r, int m) {
		int u=A[l];
		for(int i=l+1; i<=r;i++) {
			u=uclid(u,A[i]);
		}
		if(m!=0) {
			u=uclid(u,m);
		}

		return u;
	}

	// ユークリッドの互除法
    public static int uclid(int m, int n) {
    	if (m<n) {
			m^=n;
			n^=m;
			m^=n;
		}

		while(true) {
			int t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
    }


	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}