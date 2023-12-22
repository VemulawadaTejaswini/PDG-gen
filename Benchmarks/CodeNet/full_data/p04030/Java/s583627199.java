import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s = "";
		ArrayList<String> Array = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		s = scan.next();
		for (int i = 0; i < s.length(); i++) {
			Array.add(s.substring(i, i + 1));
			if ((Array.get(Array.size() - 1).equals("B"))) {
				Array.remove(Array.size() - 1);
				if(Array.size() == 0) {
					Array.add("");
				}
				Array.remove(Array.size() - 1);
				if(Array.size() == 0) {
					Array.add("");
				}
			}
		}
		for (int j = 0; j < Array.size(); j++) {
			System.out.print(Array.get(j));
		}
	}
}