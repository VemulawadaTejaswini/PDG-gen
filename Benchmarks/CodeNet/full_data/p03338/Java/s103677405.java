import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		int num = Integer.parseInt(sc1.next());
		String text = (sc1.next());
		System.out.println(cutAndCount(num, text));
		sc1.close();
	}

	public static int cutAndCount(int num, String s2) {
		int count = 0;
		for (int i = 1; i < num; i++) {
			char[] charLeft = s2.substring(0, i).toCharArray();
			char[] charRight = s2.substring(i).toCharArray();
			HashSet<Character> setLeft = new HashSet<>();
			HashSet<Character> setRight = new HashSet<>();
			for (char c : charLeft) {
				setLeft.add(c);
			}
			for (char c : charRight) {
				setRight.add(c);
			}
			setLeft.retainAll(setRight);
			if(setLeft.size() > count) count = setLeft.size();
		}
		return count;
	}
}