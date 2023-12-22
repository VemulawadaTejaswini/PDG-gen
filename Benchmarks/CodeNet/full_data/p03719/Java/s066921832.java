import java.util.Scanner;


public class TwoInt {

	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b , c;
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
