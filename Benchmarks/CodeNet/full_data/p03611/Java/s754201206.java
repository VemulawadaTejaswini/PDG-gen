import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		int X1;
		int X2;
		int X3;

		int min = Collections.min(list);
		int max = Collections.max(list);
		int ans = 0;

		for (int i = min-1; i <= max+1; i++) {
			X1 = i-1;
			X2 = i;
			X3 = i+1;
			int cnt = 0;
			for (int j = 0; j < list.size(); j++) {
				if(X1 == list.get(j) || X2 == list.get(j) || X3 == list.get(j)) {
					cnt +=1;
				}
			}
			if(cnt >= ans) {
				ans = cnt;
			}
		}
		System.out.println(ans);
	}
}
