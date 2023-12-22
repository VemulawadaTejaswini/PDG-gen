import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set.size() < N ? "NO" : "YES");
	}
}
