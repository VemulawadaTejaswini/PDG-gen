
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> list = new ArrayList<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		long num = 0;
		boolean ans = true;
		for(int i = 0; i < list.size(); i++) {
			if(num == list.get(i)) {
				ans = false;
				break;
			}
			num = list.get(i);
		}
		System.out.println(ans ? "YES" : "NO");
	}

}
