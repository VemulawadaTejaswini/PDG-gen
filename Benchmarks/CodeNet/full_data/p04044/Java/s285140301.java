import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		boolean a = false;
		while (sc.hasNext()) {
			if (a) {
				list.add(sc.next());
			} else {
				a = true;
			}

		}
		Collections.reverse(list);
		StringBuilder sb = new StringBuilder();
		for (String str : list) {
			sb.append(str);
		}
		System.out.println(sb.toString());
	}
}