
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();
        int[] d=new int[n];

        for (int i=0; i<n;i++) {
            d[i]=gi();
        }

        if(d[0]!=0) {
        	System.out.println(0);
        	return;
        }

        Arrays.parallelSort(d);

        int i=1;
        int now=1;
        long ans =1;
        long bc=1;
        while (i<d.length) {
            long cnt=0;
            while(i<d.length) {
                if(d[i]<now) {
                    System.out.println(0);
                    return;
            	} else if(d[i]>now) {
            		break;
            	} else {
            		cnt++;
            	}
                i++;
            }
            now++;
            long mod=modpow(bc, cnt, 998244353l);
            ans= (ans*mod) % 998244353l;
            bc=cnt;
        }

        System.out.println(ans);
	}

	// a^nをmodで割ったあまり
	public static long modpow(long a, long n, long mod) {
		long res=1;
		while(n>0) {
			if((n & 1) == 1) res=res*a%mod;
			a=a*a%mod;
			n=n>>1;
		}
		return res;
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