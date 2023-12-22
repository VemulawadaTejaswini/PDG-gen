import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int S, x;
		Scanner sc = new Scanner(System.in);
		Set<Integer> hash_set = new HashSet<Integer>();

		S = sc.nextInt();
		x = S;

		while(hash_set.contains(x) == false) {
			hash_set.add(x);

			if(x % 2 == 0) {
				x /= 2;
			} else {
				x = 3 * x + 1;
			}
		}

		System.out.println(hash_set.size() + 1);

		sc.close();
	}

}