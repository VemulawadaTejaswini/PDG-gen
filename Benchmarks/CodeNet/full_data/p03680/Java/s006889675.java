import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		boolean can = false;
		int nextId = 0;
		int count = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		while (count != N) {
			nextId = a[nextId] - 1;
			count++;
			if (nextId == 1) {
				can = true;
				break;
			}
		}

		if (can) {
			System.out.println(count);
		} else {
			System.out.println(-1);
		}
	}
}
