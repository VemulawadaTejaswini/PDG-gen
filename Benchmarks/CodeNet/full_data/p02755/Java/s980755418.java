import java.util.*;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		int number1 = (int) Math.ceil(A/0.08);
		int number2 = (int) Math.ceil(B/0.1);
		
		if(number1 > number2) {
			if (Math.floor(number1*0.1) == B) {
				System.out.println(number1);
			} else {
				System.out.println("-1");
			}
		} else if (number2 > number1) {
			if (Math.floor(number2*0.08) == A) {
				System.out.println(number2);
			} else {
				System.out.println("-1");
			}
		} else {
			System.out.println(number1);
		}
		
	}
}
