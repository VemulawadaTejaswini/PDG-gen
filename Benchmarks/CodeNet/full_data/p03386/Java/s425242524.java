import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		if ((b - a) <= 2 * k) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		} else {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < k; i++) {
				list.add(a + i);
				list.add(b - i);
			}
			Collections.sort(list);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
}