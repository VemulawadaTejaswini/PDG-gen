import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		boolean result = false;
		for (int i = 0; i <= N/4; i++) {
			for (int j = 0; j <= N/7; j++) {
				int total = i*4 + j*7;
				if (total==N) {
					result = true;
					break;
				}
			}
			if (result) {
				break;
			}
		}
		System.out.println(result ? "Yes" : "No");
	}
}