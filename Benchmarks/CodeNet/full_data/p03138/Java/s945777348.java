import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = in.nextLong();
		long[] a = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextLong();
		}
		int digit = 0;
		while((k>>digit)>0) {
			digit++;
		}
		long ans = 0;
		for(int i=0;i<digit;i++) {
			int count0 = 0;
			int count1 = 0;
			for(int j=0;j<n;j++) {
				if(((a[j]>>i)&1)==0) count0++;
				else count1++;
			}
			ans += Math.max(count0, count1)*(1L<<i);
		}
		for(int i=digit;i<64;i++) {
			int count1 = 0;
			for(int j=0;j<n;j++) {
				if(((a[j]>>i)&1)==1) count1++;
			}
			ans += count1*(1L<<i);
		}
		
		System.out.println(ans);
		in.close();
	}

}
