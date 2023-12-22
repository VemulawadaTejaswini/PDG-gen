import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] rods = new int[N];

		for(int i = 0; i < N; i++) {
			rods[i] = sc.nextInt();
		}

		Arrays.sort(rods);

		int a = 0;
		int b = 0;
		int index = -1;

		boolean flag = true;

		for(int i = N-1; i >= 0; i--) {
			if(a != rods[i]) {
				a = rods[i];
			} else {
				index = i;
				flag = false;
				break;
			}
		}
		if(flag) {
			a = 0;
		}

		flag = true;


		for(int i = index-1; i >= 0; i--) {
			if(b != rods[i]) {
				b = rods[i];
			} else {
				flag = false;
				break;
			}
		}

		if(flag) {
			b = 0;
		}

		System.out.println(a * b);

	}
}