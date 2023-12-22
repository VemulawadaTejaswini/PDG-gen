import java.util.*;
import java.io.*;

public class Main {
	
	
	public static long gcd(long a, long b){
		if(a<b) return gcd(b,a);
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public static long lcm(long a, long b){
		long g = gcd(a,b);
		return a/g*b;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] t = new long[N];
        
        for(int i=0;i<N;i++) t[i]=sc.nextLong();
        
        long ans = t[0];
        for(int i=1;i<N;i++) ans = lcm(ans,t[i]);
        
        System.out.println(ans);
    }
}