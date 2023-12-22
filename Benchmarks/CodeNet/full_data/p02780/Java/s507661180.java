
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++) {
			p[i]=scan.nextInt();
		}
		scan.close();

		Arrays.sort(p);
		double ans=0;
		for(int i=n-k;i<n;i++) {
			for(int j=1;j<=p[i];j++) {
				ans += ((double)1/p[i])*j;
			}
		}

		System.out.println(ans);
	}

}