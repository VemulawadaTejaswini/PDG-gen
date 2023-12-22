import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		long a[]=new long[n];
		long pair[]=new long[n*(n-1)/2];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextLong();
		}
		scan.close();
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(i!=j) {
					pair[cnt]=a[i]*a[j];
					cnt++;
				}
			}
		}
		Arrays.sort(pair);

		System.out.println(pair[k-1]);
	}
}