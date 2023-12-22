import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		if (A[0]!=0) {
			System.out.println(0);
			return ;
		}
		Arrays.parallelSort(A);
		if (A[1]==0) {
			System.out.println(0);
			return ;
		}
		long count = 1;
		for (int i=1;i<N;i++) {
			int now = A[i];
			long c = 1;
			for (;i<N;i++) {
				if (A[i]!=now) {
					if (A[i]+1!=now) {
						System.out.println(0);
						return;
					}
					i--;
					break;
				}
				c++;
			}
			count = (count *c)%998244353;
		}
		System.out.println(count);
	}
}