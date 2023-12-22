
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		
		int sum = 0;
		for (int i = 1; i < list.size(); i++) {
//			if (list.get(i - 1) == list.get(i)){
//				continue;
//			}
			sum += list.get(i) - list.get(i - 1);
		}
		System.out.println(sum);
	}
}