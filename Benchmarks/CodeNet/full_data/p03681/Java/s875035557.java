import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
    }
    
    static long MOD = (long)1e9+7;

	public static long fact(long x) {
		long ret = 1;
		for(int i = 1; i <=x ; i++)
			ret = ret * i % MOD;
		return ret;
	}
 
	public static long count(long n, long m) {
		if(Math.abs(n-m) > 1)
			return 0;
		long tmp = fact(n) * fact(m) % MOD;
		if(n == m) return 2 * tmp % mod;
		else return tmp;
	}

	public static void solve() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        out.println(count(n,m));
        out.flush();
	}
}