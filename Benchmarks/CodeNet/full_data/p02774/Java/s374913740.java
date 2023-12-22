import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k;
		n= sc.nextInt();
		k= sc.nextInt();
		long a[] = new long[n];
		for (int i=0;i<n;i++) {
			a[i] = sc.nextLong();
		}
		long b[] = new long[n*(n-1)/2];
		int count =0;
		for(int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				b[count] = a[i]*a[j];
				count++;
			}
		}
		Arrays.sort(b);
		System.out.println(b[k-1]);
	}


}