import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String w;
		w = in.next();
		for (int i = 0; i < w.length(); i++) {
			char c = w.charAt(i);
			int contatore = 0;
			for (int j = 0; j < w.length(); j++) {
				char c2 = w.charAt(j);
				if (c == c2)
					contatore++;
			}
			if (contatore % 2 != 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
