import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long mod = (long)(1e9+7);
		long N = input.nextLong();
		long K = input.nextLong();
		long maxCap = N*(N+1)/2; //NO OVERFLOW!
		long cnt = 0;
		//long minCap = (K-1)*K/2;
		for (long i = K; i <= N; i++) {
			cnt+=maxCap;
			cnt-=(N-i)*(N-i+1)/2;
			cnt-=i*(i-1)/2;
			cnt%=mod;
			cnt++;
		}
		cnt++; //(only one sum when picking all numbers)
		System.out.println(cnt);
	}
}