import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		int[] t = new int[] {a, b, c};
		Arrays.sort(t);
		if( (t[0] == t[1] && t[1] != t[2]) || (t[2] == t[1] && t[1] != t[0])) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
