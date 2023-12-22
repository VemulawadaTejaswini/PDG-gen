import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();

		if (N <= D) {
			System.out.println(1);
			return;
		}

		int count = 1, idx = D + 1;
		while (idx < N) {
			idx += D + 1;
			if(idx <= N) count++;
			idx += D;
		}
		System.out.println(count);
	}

}