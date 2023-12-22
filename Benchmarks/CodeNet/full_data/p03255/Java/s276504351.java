import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int X = in.nextInt();
		long[] x = new long[n];
		for(int i=0;i<n;i++) {
			x[i] = in.nextLong();
		}
		long[] k = new long[n];
		for(int i=0;i<n;i++) {
			k[i] = 1 + X/(x[i]*2);
		}
		long b = 0;
		long num = k[n-1];
		for(int i=n-2;i>=0;i--) {
			if(k[i]!=num) {
				b = Math.max(b, (n-i-1)%(num+1)==0 ? (n-i-1)/(num+1) : (n-i-1)/(num+1)+1);
				num = k[i];
			}
		}
		b = Math.max(b, n%(num+1)==0 ? n/(num+1) : n/(num+1)+1);
		
		long B = b;
		long min = Long.MAX_VALUE;
		for(b=Math.max(1, B-3);b<=B+3;b++) {
			long ans = n*X + b*X;
			for(int i=0;i<b;i++) {
				int j = n-1-i;
				ans += x[j];
				long count = 1;
				while(j>=b) {
					ans += (count+1)*(count+1)*(x[j]-x[(int) (j-b)]);
					j -= b;
					count++;
				}
				ans += (count+1)*(count+1)*x[j];
			}
			if(ans<min) min = ans;
		}
		
		
		
		System.out.println(min);
		in.close();
	}

}
