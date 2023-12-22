import java.util.Scanner;


public class TwoInt {

	static Scanner in = new Scanner(System.in);
	static int a, b , c;
	public static void main(String[] args) {
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if(c >= a && c <= b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
