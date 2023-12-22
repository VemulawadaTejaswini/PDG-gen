import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long count = (x / 11) * 2;
		long mod = x % 11;
		if (mod != 0) {
			count++;
			if (mod > 6) {
				count++;
			}
		}
		System.out.println(count);
	}
}
