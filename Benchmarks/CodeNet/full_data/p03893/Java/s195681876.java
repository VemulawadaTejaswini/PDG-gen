import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long n = 0;
		for (int i = 0; i <= x; i++) {
			n++;
			n *= 2;
		}
		System.out.println(n);
	}
}