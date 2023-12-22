import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long temp = x / 11;
		if((temp * 11) + 5 >= x) {
			System.out.println(temp * 2 + 1);
		} else {
			System.out.println(temp * 2 + 2);
		}
	}
}
