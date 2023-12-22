import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		long x[] = new long[n];
		long y[] = new long[n];
		long z[] = new long[n];

		for(int i=0; i<n; i++) {
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();
			z[i]=sc.nextLong();
		}

		long ans = 0;
		for(int i=0; i<8; i++) {
			long s1 = 1;long s2 = 1;long s3 = 1;
			if((i>>1&1)==1) s1=-1;
			if((i>>2&1)==1) s2=-1;
			if((i>>3&1)==1) s3=-1;
			ArrayList<Long> sum = new ArrayList<Long>();
			for(int j=0; j<n; j++) {
				sum.add(s1*x[j] + s2*y[j] + s3*z[j]);
			}
			Collections.sort(sum, Collections.reverseOrder());
			long tmp=0;
			for(int j=0; j<m; j++) {
				tmp += sum.get(j);
			}
			ans = Math.max(ans, Math.abs(tmp));
		}
		System.out.println(ans);
		sc.close();
	}


}
