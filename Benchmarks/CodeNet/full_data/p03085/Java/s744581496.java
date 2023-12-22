import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if ("A".equals(sc.nextLine())) {
			System.out.println("T");
		} else if (("G".equals(sc.nextLine()))) {
			System.out.println("C");
		} else if (("T".equals(sc.nextLine()))) {
			System.out.println("A");
		}else {
			System.out.println("G");
		}
	}
}
