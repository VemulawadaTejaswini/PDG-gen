
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		Set<Integer> set = new HashSet<>(list);
		
		int sum = 0;
		int before = 0;
		for (Integer i : set) {
			if (before == i) {
				continue;
			}
			before = i;
			sum += i;
			
		}
		System.out.println(sum);
		
	}
}