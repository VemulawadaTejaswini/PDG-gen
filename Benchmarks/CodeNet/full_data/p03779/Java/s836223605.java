import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long count = 0;
		int time = 0;
		for (int i = 1; ; i++) {
			count += i;
			if (count >= x) {
				time = i;
				break;
			}
		}
		System.out.println(time);
	}
}