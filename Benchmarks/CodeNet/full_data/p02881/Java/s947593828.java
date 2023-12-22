import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int r[]= new int[N];
		int moda =0;
			for(int a = 2;a<=Math.sqrt(N);a++) {
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
