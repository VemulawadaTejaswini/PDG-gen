import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		int cnt = 0;
		while (s.contains("BW")) {
			s = s.replaceFirst("BW", "WB");
			cnt++;
		}
		System.out.println(cnt);
	}
}
