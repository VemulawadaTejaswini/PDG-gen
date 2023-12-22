import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Integer num[] = new Integer[105];
		for (int i = 0; i < N; i++) {
			num[i] =sc.nextInt();
		}

		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			if (!li.contains(num[i])) {
				li.add(num[i]);
			}
		}

		System.out.println(li.size());
	}
}