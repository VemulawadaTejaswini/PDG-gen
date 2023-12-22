import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = scan.next();
		String str1;
		String str2;

		if(num % 2 == 0) {
			str1 = str.substring(0, num/2);
			str2 = str.substring(num/2, num);
			if (str1.equals(str2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}

	}


}