import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long[] keta = new long[11000];
		
		for(long i = A; i <= B; i++) {
			long a = i;
			int x = 0;	
			while(a > 1) {
				keta[x] += a % 2;
				a /= 2;
				x++;
			} 
			keta[x] += a;
		}
		
		long ans = 0;
		
		for(int i = 0; i < 10000; i++) {
			keta[i] = keta[i] % 2;
			ans += keta[i] * (long)Math.pow(2, i);
		}
		System.out.println(ans);
	}
}
