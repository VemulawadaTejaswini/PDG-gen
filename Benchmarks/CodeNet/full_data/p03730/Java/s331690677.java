import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		Integer[] div = new Integer[B];
		int tmpA = A;
		for (int i = 0; i <= B; i++) {
			if (div[tmpA % B] != null) {
				break;
			}
			div[tmpA % B] = 1;
			tmpA += A;
		}
		if (div[C] != null) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
