import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveB();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a - b == b - c) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		String o = sc.nextLine();
		String e = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < e.length(); i++) {
			sb.append(o.charAt(i));
			sb.append(e.charAt(i));
		}
		if (o.length() != e.length()) {
			sb.append(o.charAt(o.length() - 1));
		}
		System.out.println(sb.toString());
	}
}