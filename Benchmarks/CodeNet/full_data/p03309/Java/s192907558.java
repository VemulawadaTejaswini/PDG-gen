import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=1;i<n+1;i++) {
			a[i-1]=sc.nextInt()-i;
		}
		Arrays.sort(a);

		int chuuou0=a[n/2];
		long summary0=0;
		for(int i=0;i<n;i++) {
			summary0+=zettaichi(a[i]-chuuou0);
		}
		if(n>=2) {
			int chuuou1=a[n/2+1];
			long summary1=0;

			for(int i=0;i<n;i++) {
				summary1+=zettaichi(a[i]-chuuou1);
			}
			if(summary0>summary1) {
				summary0=summary1;
			}
		}
		if(n>=3) {
			int chuuou2=a[n/2+1];
			long summary2=0;

			for(int i=0;i<n;i++) {
				summary2+=zettaichi(a[i]-chuuou2);
			}
			if(summary0>summary2) {
				summary0=summary2;
			}
		}

		System.out.print(summary0);


	}



	public static int zettaichi(int a) {
		if(a>=0)
			return a;
		else
			return -a;
	}


}
