import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long[] pref = new long[N];
		long[] suff = new long[N];
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextLong();
		}
		pref[0]=arr[0]; //Prefix and suffix sums using a dp approach
		suff[N-1]=arr[N-1];
		for (int i = 1; i < N; i++) {
			long prev = pref[i-1];
			long cur = arr[i];
			pref[i]=GCD(prev,cur);
		}
		for (int i = N-2; i >=0; i--) {
			long prev = suff[i+1];
			long cur = arr[i];
			suff[i]=GCD(prev,cur);
		}
		long ans = pref[N-1]; //Assuming max GCD is GCD of entire tuple to begin with
		ans=Math.max(ans, suff[1]);//Excluding first number
		ans=Math.max(ans, pref[N-2]);//Excluding last number
		for (int cur = 1; cur < N-1; cur++) {
			int prefIndex = cur-1;
			int suffIndex = cur+1;
			long L = pref[prefIndex];
			long R = suff[suffIndex];
			ans=Math.max(ans, GCD(L,R)); //Excluding intermediate elements
		}
		System.out.println(ans);
	}
	public static long GCD(long a, long b) { //Euclidean GCD
		if (a==0||b==0) return Math.max(a, b);
		return GCD(Math.max(a, b)%Math.min(a, b),Math.min(a, b));
	}
}