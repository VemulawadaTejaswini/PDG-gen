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

		double max=0;
		for(int i=0;i<=n-k;i++) {
			double ans=0;
			for(int j=i;j<i+k;j++) {
				for(int l=1;l<=p[j];l++)ans*=l;
				double x=Math.pow(p[j], p[j]);
				ans=((double)1/x)*ans;

			}
			if(max<ans)max=ans;
		}

		System.out.println(max);
	}

}