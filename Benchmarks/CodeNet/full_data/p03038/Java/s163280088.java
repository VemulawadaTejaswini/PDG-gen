import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		long[] a = new long[N];
		long[] b = new long[M];
		long[] c = new long[M];

		for(int i=0;i<N;i++) {
			a[i] = sc.nextLong();
		}

		for(int i=0;i<M;i++) {
			b[i] = sc.nextLong();
			c[i] = sc.nextLong();
		}

		Arrays.sort(a);

		for(int j=0;j<M;j++) {
		for(int i=0;i<b[j];i++) {
			if(a[i]<=c[j]) a[i]=c[j];
			else  break;

		}
		Arrays.sort(a);
		}

		long sum=0;

		for(int i=0;i<N;i++) {
			sum = sum + a[i];
		}

		System.out.print(sum);

}
}