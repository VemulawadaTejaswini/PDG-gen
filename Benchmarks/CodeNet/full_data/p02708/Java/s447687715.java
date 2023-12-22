import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long k = in.nextLong();
		long ans = 0l;
		long M = 1000000007;
		for(long m = n+1; m>=k; m--){
			long s = (m*(n-m+1)+1)%M;
			ans += s;
			ans = ans%M;
		}
		System.out.println(ans);
	}

}