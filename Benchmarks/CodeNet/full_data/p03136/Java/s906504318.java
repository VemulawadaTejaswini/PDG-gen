import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 117
//B	Polygon
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> in = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			in.add(sc.nextInt());
		}
		sc.close();

		int max = Collections.max(in);
		int sum = 0;
		for (Integer i : in) {
			sum += i;
		}

		System.out.println((sum - max) > max ? "Yes" : "No");

	}
}
