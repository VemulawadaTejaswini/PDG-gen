import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int a;
		int b;
		int c;
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] numbers = num.split(" ");
		a = Integer.parseInt(numbers[0]);
		b = Integer.parseInt(numbers[1]);
		c = Integer.parseInt(numbers[2]);
		double d;
		d = Math.sqrt(a) + Math.sqrt(b);
		if((Math.sqrt(a) + Math.sqrt(b))<Math.sqrt(c)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
