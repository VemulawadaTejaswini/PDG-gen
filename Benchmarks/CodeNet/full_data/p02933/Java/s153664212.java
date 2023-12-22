import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (Integer.valueOf(sc.nextLine()) >= 3200) {
			System.out.println(sc.nextLine());
		} else {
			System.out.println("red");
		}
	}
}
