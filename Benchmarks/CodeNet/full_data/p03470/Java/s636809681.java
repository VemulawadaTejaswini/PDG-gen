import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> d = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			d.add(sc.nextInt());
		}

		// 出力
		System.out.println(d.size());

		sc.close();
	}
}
