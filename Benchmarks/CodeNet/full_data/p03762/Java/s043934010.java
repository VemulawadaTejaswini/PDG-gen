
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[m];
		for(int i=0;i<n;i++) x[i] = sc.nextInt();
		for(int i=0;i<m;i++) y[i] = sc.nextInt();
		sc.close();

		long div = (long)Math.pow(10, 9)+7;
		long sum = 0;
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				long dx = x[i]-x[i-1];
				long dy = y[j]-y[j-1];
				sum += dx*dy*(n-i)*i*(m-j)*j;
				sum %= div;
			}
		}
		System.out.println(sum);
	}

}
