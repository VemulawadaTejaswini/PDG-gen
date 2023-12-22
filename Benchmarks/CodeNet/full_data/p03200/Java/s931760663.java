import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0, b = 0;
		for (char c : sc.next().toCharArray()) {
			if (c == 'B') b++;
			else res += b;
		}
		System.out.println(res);
	}
}