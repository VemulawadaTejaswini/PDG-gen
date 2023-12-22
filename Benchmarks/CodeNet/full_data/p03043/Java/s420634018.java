import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double p0 = 0.0;
		if(n >= k) {
			p0 = (n - (k-1))/n;
		}
		double p1 = 0.0;
		for(int i = 1; i <= n; i++) {
			int x = i;
			int pow = 0;
			while(x < k) {
				x *= 2;
				pow++;
			}
			p1 += (1.0/Math.pow(2.0, pow));
		}
		System.out.println(p0 + p1/n);
	}
}