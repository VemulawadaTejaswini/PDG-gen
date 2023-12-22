import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {

		char c_buf[] = new char[128];
		InputStreamReader isr = new InputStreamReader(System.in);
		Checker checker = new Checker();
		
		while (!checker.isFull()) {
			isr.read(c_buf);
			if (!checker.add(c_buf)) {
				break;
			}
		}
		
		if (checker.isFull()) {
			System.out.println("None");
		} else {
			System.out.println(checker.getAnser());
		}
	}

}

class Checker {
	private final HashSet<Character> pre = new HashSet<>();

	public boolean add(char[] chars) {
		for (char c : chars) {
			if (c < 'a' || 'z' < c) {
				return false;
			}
			pre.add((Character) c);
		}
		return true;
	}

	public boolean isFull() {
		return pre.size() == 26;
	}

	public Character getAnser() {
		for (char c = 'a'; c <= 'z'; c++) {
			if (!pre.contains((Character) c)) {
				return (Character) c;
			}
		}
		return null;
	}
}
