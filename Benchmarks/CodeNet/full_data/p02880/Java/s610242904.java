import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// 九九の結果を格納したSetを作成
		Set<Integer> kuku = new TreeSet<>();
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				kuku.add(i * j);
			}
		}
		
		// 結果の出力
		System.out.println(kuku.contains(N)? "Yes" : "No");
		
		sc.close();
	}

}
