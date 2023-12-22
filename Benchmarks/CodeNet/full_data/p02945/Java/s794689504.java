import java.util.Arrays;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] c = {a + b, a - b, a * b};

		Arrays.sort(c);

		System.out.println(c[2]);
	}
}