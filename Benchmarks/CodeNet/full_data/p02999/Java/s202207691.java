import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		if(Integer.parseInt(sc.next()) < Integer.parseInt(sc.next())) {
			System.out.println(0);
		} else {
			System.out.println(10);
		}

	}
}