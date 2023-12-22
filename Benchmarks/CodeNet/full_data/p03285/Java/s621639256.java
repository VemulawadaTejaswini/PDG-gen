import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		int flag = 0;

		if(n % 4 == 0|| n % 7 == 0) {
			flag++;
		}else {
			int a = n;
			int b = n;
			while(a > 3) {
				a -= 4;
				if(a % 7 == 0) {
					flag ++;
					break;
				}
			}
			while(b > 3) {
				b -= 7;
				if(b % 4 == 0) {
					flag ++;
					break;
				}
			}
		}

		if(flag == 0) {
		System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}