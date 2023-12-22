import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int p[]=new int[n];
		double x[]=new double[n];
		for(int i=0;i<n;i++) {
			p[i]=scan.nextInt();
		}
		scan.close();

		for(int i=0;i<n;i++) {
			for(int l=1;l<=p[i];l++) {
				x[i] += ((double)1/p[i])*l;
			}
		}
		double max=0;
		for(int i=0;i<=n-k;i++) {
			double ans=0;
			for(int j=i;j<i+k;j++) {
				ans += x[j];
			}
			if(max<ans)max=ans;
		}

		System.out.println(max);

	}

}