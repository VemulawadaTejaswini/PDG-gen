import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	static HashMap<Integer, Integer> primefactors;
	static int mod = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new FileReader("input"));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		primefactors = new HashMap<>();
		int a[] = new int[n];
		while(n-->0) {
			a[n] = Integer.parseInt(st.nextToken());	
			pf(a[n]);
		}
		long lcm = 1l;
		for(Entry<Integer, Integer>e:primefactors.entrySet()) {
			lcm *= pow(e.getKey(), e.getValue());
			lcm %= mod;
		}
		long ans = 0;
		for(int i:a) {
			ans += lcm*modInverse(i);
			ans %= mod;
		}
		out.println(ans%mod);
		out.flush();
	}
	static long modInverse(int a) {
		return pow(a,mod-2);
	}
	static long pow(long a,int n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=res*a%mod;
	        }
	        a=a*a%mod;
	        n>>=1;
	    }
	    return res;
	}

 	static void pf(int n){
 		int cnt;
 		int l = n;
 		for(int i=2;i*i<=l;i++) {
 			cnt = 0;
 			while(n>1 && n%i == 0) {
 				cnt++;
 				n/=i;
 			}
 			if(cnt > 0)
 			{
 				primefactors.put(i, Math.max(cnt,primefactors.getOrDefault(i, 0)));
 			}
 		}
 		if(n>1)
 		{
 			primefactors.put(n, Math.max(1, primefactors.getOrDefault(n, 0)));
 		}
 	}
}
