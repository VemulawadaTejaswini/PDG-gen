import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long sum[] = new long[200005];
		long p[] = new long[200005];
		sum[0]=0;
		for(int i=0; i<n; i++) {
			p[i] = sc.nextLong();
			sum[i+1] = sum[i]+p[i];
		}
		long max = 0;
		int maxi = 0;
		for(int i=0; i<n-k+1; i++) {
			long tmp = sum[i+k] - sum[i];
			if(max<tmp) {
				max=tmp;
				maxi=i;
			}
		}
		double e = 0;
		for(int i=0; i<k; i++) {
			double tmp = 0;
			for(int j=1; j<=p[i+maxi]; j++) {
				tmp += (double)j/(double)p[i+maxi];
			}
			e+=tmp;
		}
		System.out.println(e);

		sc.close();
	}
}
