import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String sumA = "";
		String sumB = "";
		List<String> list = new ArrayList();
		for (int i = 0; i < Integer.parseInt(b); i++) {
			sumA += a;
		}
		for (int i = 0; i < Integer.parseInt(a); i++) {
			sumB += b;
		}
		list.add(sumA);
		list.add(sumB);
		Collections.sort(list);
		System.out.println(list.get(0));
		sc.close();
	}
}