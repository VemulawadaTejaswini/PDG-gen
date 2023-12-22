import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long re = 0;
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			long temp = sc.nextLong();
			re += temp;
			int count = 0;
			while (count < M && temp > 0) {
				list.add(temp / 2 + temp % 2);
				temp /= 2;
				count++;
			}
		}
		Collections.sort(list);
		for (int i = 0; i < M && i < list.size(); i++) {
			re -= list.get(list.size() - 1 - i);
		}
		System.out.println(re);
	}
}