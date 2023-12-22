import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	    long p = 1000000007;
		int n = scan.nextInt();
		long[] a = new long[n];
		for(int i=0;i < n;i++) {
			a[i]= scan.nextLong();
		}
		long sum =0;
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				sum = (sum + (a[i]^a[j]))%p;
			}
		}
		System.out.println(sum);
	}
}
