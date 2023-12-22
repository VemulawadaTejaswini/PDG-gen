import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 55555;
		boolean isPrime = false;
		int count = 2;
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		for (int i = 5; i < num; i++) {
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
				isPrime = true;
			}
			if (isPrime) {
				count++;
				list.add(i);
			}
		}
		for (int i = 0; i < N; i++) {
			if (i != N - 1) {
				System.out.print(list.get(i) + " ");
			} else {
				System.out.println(list.get(i));
			}
		}
	}
}