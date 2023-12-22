import java.util.*;

public class AtCoder_A{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int swap = b;
		b = a;
		a = swap;

		a = c;
		c = swap;

		System.out.println(a + " " + b + " " + c);
	}
}