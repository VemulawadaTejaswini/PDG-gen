import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Main {
	static BufferedReader jvin = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter jvout = new PrintWriter(System.out);
	
	static int MOD = (int)1E9+7;
	
	public static void main(String[] args) throws IOException {
		Main instance = new Main();
		instance.passStaticVar();
	}

	long fact(int n) {
		long res = 1;
		for (int i = 1; i <= n; ++i)
			res = (res*i)%MOD;
		return res;
	}

	public void passStaticVar() throws IOException {
		String[] t = jvin.readLine().split(" ");
		int N = Integer.parseInt(t[0]), M = Integer.parseInt(t[1]);
		long fN = fact(N), fM = fact(M), res = 0;
		if (N == M) 
			res = (fN*fM*2)%MOD;
		else if (N == M+1 || M == N+1)
			res = (fN*fM)%MOD;
		jvout.println(res);
		jvout.flush();
	}
}
