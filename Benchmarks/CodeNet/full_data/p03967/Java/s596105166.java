import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char s[] = sc.next().toCharArray();
		int cnt = 0;
		for (int i = 0; i < s.length; i = i + 2) {
			if (s[i] == 'p') {
				cnt--;
			}
		}
		for (int i = 1; i < s.length; i = i + 2) {
			if (s[i] == 'g') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
