import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int result = 0;
		for (int i = 0; i <= N; i++) {
			String tmp = String.valueOf(i);
			int sum = 0;
			for (String s : tmp.split("")) {
				int num = Integer.parseInt(s);
				sum += num;
			}
			if (sum >= A && sum <= B) {
				result += i;
			}
		}
		System.out.println(result);
	}
}