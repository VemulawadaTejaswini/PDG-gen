import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}

		Collections.reverse(list);

		int ans = 0;
		int count = 0;

		for(int i  = 0; i < N; i++) {
			if(list.get(i - 1) <= list.get(i)) {
				count++;
			}else {
				count = 0;
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}
}