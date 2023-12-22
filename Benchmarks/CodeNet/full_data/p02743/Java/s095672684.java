import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		double x = Math.sqrt(a);
		double y = Math.sqrt(b);
		double z = Math.sqrt(c);
		if (x + y < z) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}