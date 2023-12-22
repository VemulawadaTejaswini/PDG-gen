import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = s1.replace("/", "");
		sc.close();
		if (s2.compareTo("20190430") <= 0) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}
}
