import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println("2018/01/" + str.substring(8));
		}
	}
}
