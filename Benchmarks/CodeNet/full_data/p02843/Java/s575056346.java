import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = x / 100;
		int mod = x % 100;
		if ((mod + 5 - 1) / 5 > count) {
		    System.out.println(0);
		} else {
		    System.out.println(1);
		}
	}
}
