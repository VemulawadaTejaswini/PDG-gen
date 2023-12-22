import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "", "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN" };
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		for (int i = 0; i < s.length; i++) {
			if (a.equals(s[i])) {
				System.out.println(i);
			}
		}
		kb.close();
	}

}
