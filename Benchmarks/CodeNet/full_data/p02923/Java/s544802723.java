import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int temp = 0;
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			list.add((long) sc.nextInt());
		}

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i - 1) >= list.get(i)) {
				temp++;
			} else {
				max = temp;
				temp = 0;
			}
		}
		if (max < temp) {
			max = temp;
		}
		System.out.println(max);
		sc.close();

	}
}
