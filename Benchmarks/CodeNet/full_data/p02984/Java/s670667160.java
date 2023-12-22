import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		long[] a = new long[n];
		long sum = 0;
		for(i=0;i<n;i++) {
			a[i] = parseLong(sc.next());
			sum += a[i]; 
		}
		sc.close();
//		sum *= 2;
//		System.out.println(sum);
		long asum;
		for(i=0;i<n;i++) {
			asum = 0;
			for(j=1;j<n;j+=2) {
				asum += a[(i+j)%n];
			}
			System.out.print(sum-2*asum);
			System.out.print(" ");
		}
//		System.out.print(sum-2*a[0]);
	}
}
