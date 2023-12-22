import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long A = input.nextLong();
		long B = input.nextLong();
		long C = input.nextLong();
		long D = input.nextLong();
		long E = input.nextLong();
		long ans = 0;
		
		long S1 = ceil(N,A);
		ans+=S1;
		long sum = S1;
		
		long S2 = ceil(N,B);
		S2-=(sum-1);
		if (S2>0) {
			ans+=S2;
		}else {
			ans++;
		}
		sum+=S2;
		
		long S3 = ceil(N,C);
		S3-=(sum-2);
		if (S3>0) {
			ans+=S3;
		}else {
			ans++;
		}
		sum+=S3;
		
		long S4 = ceil(N,D);
		S4-=(sum-3);
		if (S4>0) {
			ans+=S4;
		}else {
			ans++;
		}
		sum+=S4;
		
		long S5 = ceil(N,E);
		S5-=(sum-4);
		if (S5>0) {
			ans+=S5;
		}else {
			ans++;
		}
		sum+=S5;
		System.out.println(ans);
	}
	public static long ceil(long num, long den) {
		long ans = num/den;
		if (num%den!=0) ans++;
		return ans;
	}
}