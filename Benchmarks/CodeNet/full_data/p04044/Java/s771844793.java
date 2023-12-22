import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.next();
		List<String> s = new ArrayList<String>();
		for (int i = 0; i < n; i++)
			s.add(sc.next());
		Collections.sort(s);
		for (int i = 0; i < n - 1; i++)
			System.out.print(s.get(i));
		System.out.println(s.get(n - 1));
	}
}