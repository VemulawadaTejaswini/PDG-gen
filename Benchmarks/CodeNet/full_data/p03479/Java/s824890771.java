import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		int count = 0;
		long n = y / x;
		while (n > 0) {
			n /= 2;
			count++;
		}
		System.out.println(count);
	}
}
