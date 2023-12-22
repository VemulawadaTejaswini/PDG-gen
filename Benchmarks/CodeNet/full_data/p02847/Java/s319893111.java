import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if ("SUN".equals(s)) {
			System.out.println(7);
		} else if ("MON".equals(s)) {
			System.out.println(6);
		} else if ("TUE".equals(s)) {
			System.out.println(5);
		} else if ("WED".equals(s)) {
			System.out.println(4);
		} else if ("THU".equals(s)) {
			System.out.println(3);
		} else if ("FRI".equals(s)) {
			System.out.println(2);
		} else if ("SAT".equals(s)) {
			System.out.println(1);
		}
	}
}
