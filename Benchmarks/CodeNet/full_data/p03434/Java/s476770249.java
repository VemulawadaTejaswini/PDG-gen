
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);
		int result = 0;
		for(int i = 0; i < n; i++) {
			if(i == 0 || i % 2 == 0) {
				result += list.get(i);
			} else {
				result -= list.get(i);
			}
		}
		System.out.println(result);
	}

}
