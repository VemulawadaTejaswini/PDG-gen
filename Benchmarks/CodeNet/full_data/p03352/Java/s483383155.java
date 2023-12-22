import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		int idx = 1;
		int ans = 1;
		while (idx * idx < a) {
			ans = idx * idx;
			idx++;
		}
		System.out.println(ans);
	}
}
