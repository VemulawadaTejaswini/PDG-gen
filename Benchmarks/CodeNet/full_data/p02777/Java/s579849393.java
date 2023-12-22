import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			String b = sc.next();
			int na = sc.nextInt();
			int nb = sc.nextInt();
			String c = sc.next();
			if (a.equals(c)) {
				System.out.print(na - 1 + " " + nb);
			} else {
				nb = nb - 1;
				System.out.print(na + " " + nb);
			}
		}
	}

}
