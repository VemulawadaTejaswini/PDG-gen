import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] S = sc.next().toCharArray();

		HashMap<Character, Integer> abcMap = new HashMap<Character, Integer>();
		for (char c : Const.alp) {
			abcMap.put(c, 0);
		}
		for (char c : S) {
			int value = abcMap.get(c);
			abcMap.put(c, ++value);
		}
		boolean None = true;
		for (int i = 0; i < Const.alp.length; i++) {
			int value = abcMap.get(Const.alp[i]);
			if (value == 0) {
				System.out.println(Const.alp[i]);
				None = false;
				return;
			}
		}
		if (None)
			System.out.println("None");
	}
}