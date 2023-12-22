
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int N = scan.nextInt();
		int[] l = new int[N];
		int[] r = new int[N];
		for(int i = 0; i < N; i++) {
			l[i] = scan.nextInt();
			r[i] = scan.nextInt();
			sum += Math.abs(l[i] - r[i]) + 1;
		}
		System.out.println(sum);
		scan.close();

	}

}
