import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		String ans = "";
		Map<Character, Integer> map = new HashMap();
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		map.put('f', 6);
		map.put('g', 7);
		map.put('h', 8);
		map.put('i', 9);
		map.put('j', 10);
		map.put('k', 11);
		map.put('l', 12);
		map.put('m', 13);
		map.put('n', 14);
		map.put('o', 15);
		map.put('p', 16);
		map.put('q', 17);
		map.put('r', 18);
		map.put('s', 19);
		map.put('t', 20);
		map.put('u', 21);
		map.put('v', 22);
		map.put('w', 23);
		map.put('x', 24);
		map.put('y', 25);
		map.put('z', 26);
		Map<Integer, Character> map2 = new HashMap();
		map2.put(1, 'a');
		map2.put(2, 'b');
		map2.put(3, 'c');
		map2.put(4, 'd');
		map2.put(5, 'e');
		map2.put(6, 'f');
		map2.put(7, 'g');
		map2.put(8, 'h');
		map2.put(9, 'i');
		map2.put(10, 'j');
		map2.put(11, 'k');
		map2.put(12, 'l');
		map2.put(13, 'm');
		map2.put(14, 'n');
		map2.put(15, 'o');
		map2.put(16, 'p');
		map2.put(17, 'q');
		map2.put(18, 'r');
		map2.put(19, 's');
		map2.put(20, 't');
		map2.put(21, 'u');
		map2.put(22, 'v');
		map2.put(23, 'w');
		map2.put(24, 'x');
		map2.put(25, 'y');
		map2.put(26, 'z');

		boolean use[] = new boolean[27];
		char c[] = S.toCharArray();
		if (S.equals("zyxwvutsrqponmlkjihgfedcba")) {
			ans = "-1";
		} else if (S.length() == 26) {
			int last = 0;
			String add = "";
			for (int i = 0; i < S.length() - 1; i++) {
				if (map.get(c[i]) < map.get(c[i + 1])) {
					last = i + 1;
				}
			}
			for (int i = 0; i < last; i++) {
				int tmp = map.get(c[i]);
				use[tmp] = true;
			}
			for (int i = 1; i < 27; i++) {
				if (!use[i]) {
					add = String.valueOf(map2.get(i));
					break;
				}
			}
			ans = S.substring(0, last - 1) + add;
		} else {
			String add = "";
			for (int i = 0; i < S.length(); i++) {
				int tmp = map.get(c[i]);
				use[tmp] = true;
			}
			for (int i = 1; i < 27; i++) {
				if (!use[i]) {
					add = String.valueOf(map2.get(i));
					break;
				}
			}
			ans = S + add;
		}

		System.out.println(ans);
	}
}
