import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		char c1 = 0, c2 = 0;
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();
		StringBuilder result = new StringBuilder();

		for(int i = 0; i < s.length(); i++) {
			result.setLength(0);
			a.setLength(0);
			b.setLength(0);
			if((c1 = s.charAt(i)) != (c2 = t.charAt(i))) {
				a.append(s.replace(c1, c2));
				b.append(s.replace(c2, c1));
				for(int j = 0; j < s.length(); j++) {
					if(a.charAt(j) != b.charAt(j) && a.charAt(j) == s.charAt(j)) {
						result.append(b.charAt(j));
					}else {
						result.append(a.charAt(j));
					}
				}
				s = result.toString();
			}
		}
		if(s.equals(t)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}