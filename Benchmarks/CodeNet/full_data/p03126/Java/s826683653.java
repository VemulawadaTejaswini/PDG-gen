//2019/3/14
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		int[] m = new int[M+1];

		Arrays.fill(m, 0);

		int K = 0;

		int A = 0;

		int ans = 0;

		for(int i=0;i<N;i++) {

			K = sc.nextInt();

			for(int j=0;j<K;j++) {

				A = sc.nextInt();

				m[A]++;
			}
		}

		for(int i=0;i<=M;i++) {

			if(m[i]==N) ans++;
		}

		System.out.println(ans);
	}

}
