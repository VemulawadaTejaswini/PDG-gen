import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long a[] = new long[N];
		long sum = 0;
		for(int i = 0;i<N;i++){
			a[i] = sc.nextLong();
			sum += a[i];
		}

		double beta = (double)sum/N - (double)(N + 1)/2;

		long lowbeta = (long)Math.floor(beta);
		long highbeta = (long)Math.ceil(beta);

		long lowalpha = 0;
		long highalpha = 0;

		for(int i=0;i<N;i++){
			lowalpha += Math.abs(a[i] - lowbeta - i - 1);
			highalpha += Math.abs(a[i] - highbeta - i - 1);
		}
		if(lowalpha < highalpha)
			System.out.println(lowalpha);
		else
			System.out.println(highalpha);
	}
}