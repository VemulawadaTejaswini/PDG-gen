import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();

		List<Long> list = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			list.add(scan.nextLong());
		}

		// 降順ソート
		Collections.sort(list, Collections.reverseOrder());

		if(N < K) {
			System.out.println(0);
			return;
		}

		long ans = 0l;

		for(int i = K; i < N; i++) {
			ans += list.get(i);
			//System.out.println(ans);

		}

		System.out.println(ans);
	}
}