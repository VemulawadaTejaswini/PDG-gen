import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[] a = new long[7];
		for(int i=0; i<7; i++)
			a[i] = sc.nextLong();
		
		long ans = a[1] + a[0]/2*2 + a[3]/2*2 + a[4]/2*2;
		
		if(a[0]>=1 && a[3]>=1 && a[4]>=1) {
			ans = Math.max(ans, a[1] + 3 + (a[0]-1)/2*2 + (a[3]-1)/2*2 + (a[4]-1)/2*2);
		}
		
		System.out.println(ans);
		sc.close();
	}
}
