

import java.util.*;
import java.math.*;
import java.math.BigInteger;
class ppo implements Comparable<ppo>{
	int a,b;
	public ppo(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int compareTo(ppo other) {
		return this.a-other.a;
	}
}
public class Main {
	static final long mod = (int) (1e9 + 7);
	static final int inf = (int) (1e9);
	static final int maxn = (int) (1e5 + 10);
	static long solve(long x) {
		long ret=0;
		if(x%4==0) ret=x;
		if(x%4==1) ret=1;
		if(x%4==2) ret=x+1;
		if(x%4==3) ret=0;
		return ret;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long a=cin.nextLong(),b=cin.nextLong();
		long ans=solve(b)^solve(a-1);
		System.out.println(ans);
	}
}