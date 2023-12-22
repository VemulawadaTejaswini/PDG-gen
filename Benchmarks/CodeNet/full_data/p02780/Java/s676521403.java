import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(p(sc.nextDouble()));
		}
		sc.close();

		List<Double> list2 = new ArrayList<>();
		Queue<Double> q = new ArrayDeque<>();
		Double sum = 0d;
		for (int i = 0; i < k; i++) {
			q.add(list.get(i));
			sum += list.get(i);
		}
		list2.add(sum);
		for (int i = k; i < n; i++) {
			Double temp = list.get(i);
			sum = sum - q.poll() + temp;
			q.add(temp);
			list2.add(sum);
		}

		System.out.println(Collections.max(list2));
	}

	public static Double p(Double num) {
		return ((1d + num) * (num / 2d)) / num;
	}
}
