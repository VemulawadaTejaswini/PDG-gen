import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int min = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp <= min) {
				count++;
				min = tmp;
			}
		}
		System.out.println(count);

	}
}
