import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();

		if (money % 7 == 0) {
			System.out.println("Yes");
		}else if(money % 4 ==0) {
			System.out.println("Yes");
		} else {
			int result = money / 7 + 1;
			for (int i = 0; result - i >= 0; i++) {
				if ((result - i) * 7 + (i * 4) == money) {
					System.out.println("Yes");
					break;
				} else if (result - i == 0)
					System.out.println("No");
			}

		}
	}

}