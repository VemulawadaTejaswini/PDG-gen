
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		String reg = "^[1-9] {" + a + "}-[1-9]{" + b + "}$";
		if(s.matches(reg)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
