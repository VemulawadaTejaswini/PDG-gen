import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int c = 1;
		for(int i = 0; i < N; i++) {
				x[i] = sc.nextInt();
				}

		Arrays.sort(x);
		for(int i = 0; i < N; i++) {
			for(int j = 1; j < N; j++) {
				if(x[i] > x[j]) {
				c++;
				}
			}
		}
		System.out.println(c);
	}
}
