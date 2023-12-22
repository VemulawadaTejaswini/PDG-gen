
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		char a = x.charAt(0);
		boolean flag = true;
		for(int i = 1; i < 4; i++) {
			if(a == x.charAt(i)) {
				flag = false;
				break;
			} else {
				a = x.charAt(i);
			}
		}
		if(flag) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}

}
