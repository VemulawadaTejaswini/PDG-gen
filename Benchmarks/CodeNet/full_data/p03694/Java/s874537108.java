import java.util.Arrays;
import java.util.Scanner;

/**
 * https://abc064.contest.atcoder.jp/tasks/abc064_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) a[i] = sc.nextInt();
		sc.close();
		
		Arrays.sort(a);
		
		System.out.println(a[N-1]-a[0]);

	}

}