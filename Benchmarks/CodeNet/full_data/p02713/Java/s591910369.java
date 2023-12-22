import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();

		long[][]a = new long[k + 1][k + 1];

		int i,j,l;
		for(i = 1;i <= k; i++) {
			for(j = 1; j <= k; j++) {
				a[i][j] = gcd(i, j);
			}
		}

		long sum = 0;
		for(i = 1; i <= k; i++) {
			for(j = 1; j <= k; j++) {
				for(l = 1; l <= k; l++) {
					sum += gcd(a[i][j], l);
				}
			}
		}
		System.out.println(sum);
	}
	public static long gcd(long a, long b) {
		if(b == 0)
			return a;

		return gcd(b, a % b);
	}
}
