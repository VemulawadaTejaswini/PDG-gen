
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		for(int i = 0; i < n; i++) {
			if(i <= n / 2) {
				System.out.println(list.get(n / 2 + 1));
			} else {
				System.out.println(list.get(n / 2));
			}
		}
	}

}
