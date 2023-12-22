import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int a = sc.nextInt();
		int b = sc.nextInt();
		int one = a-b;
		int two = a+b;
		int three = a*b;
		int four = Math.max(one,two);


		System.out.println(Math.max(three,four));

	}
}
