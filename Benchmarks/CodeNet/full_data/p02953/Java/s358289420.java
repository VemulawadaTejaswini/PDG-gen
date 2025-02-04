import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		if (N == 1) {
			System.out.println("Yes");
			sc.close();
			return;
		}
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				arr[i] = Integer.parseInt(sc.next());
			} else if (i == 1) {
				int current = Integer.parseInt(sc.next());
				if (arr[i - 1] - 1 > current) {
					System.out.println("No");
					sc.close();
					return;
				} else if (arr[i - 1] - 1 == current) {
					int temp = arr[i - 1];
					arr[i - 1] = temp - 1;
					arr[i] = current;
				} else {
					arr[i] = current;
				}
			} else {
				int current = Integer.parseInt(sc.next());
				if (arr[i - 1] - 1 > current) {
					System.out.println("No");
					sc.close();
					return;
				} else if (arr[i - 1] - 1 == current) {
					if (arr[i - 1] == arr[i - 2]) {
						System.out.println("No");
						sc.close();
						return;
					}
					int temp = arr[i - 1];
					arr[i - 1] = temp - 1;
					arr[i] = current;
				} else {
					arr[i] = current;
				}
			}
		}
		sc.close();
		System.out.println("Yes");
	}
}