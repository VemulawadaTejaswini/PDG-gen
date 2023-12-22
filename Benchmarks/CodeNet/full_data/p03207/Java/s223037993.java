import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] p = new int [N];

		for(int i = 0;i<N; i++) {
			p[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(p);

		p[N-1] /= 2;
		int sum = 0;
		for(int i = 0;i<N;i++) {
			sum += p[i];
		}

		System.out.println(sum);


	}

}