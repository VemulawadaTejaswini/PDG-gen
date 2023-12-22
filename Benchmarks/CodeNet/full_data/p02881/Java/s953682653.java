import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long r[]= new long[(int)N];
		long moda =0;
			for(long a = 2;a<=Math.sqrt(N);a++) {
					if(N%a==0) {
					 moda = N/a;
						for(int b = 0;b<N;b++) {
							r[b]=a+moda-2;
						}
					}
			}
			Arrays.sort(r);
			System.out.println(r[0]);
	}
}
