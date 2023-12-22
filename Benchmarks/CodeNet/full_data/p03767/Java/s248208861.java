import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	static final long MOD = 1000000007L;

	public static void main(String[] args){
		Main main = new Main();
		main.solveA();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < N * 3; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		long sum = 0;
		for (int i = N; i < N * 3; i++) {
			if (i % 2 == 0) {
				sum += list.get(i);
			}
		}
		System.out.println(sum);
	}
}