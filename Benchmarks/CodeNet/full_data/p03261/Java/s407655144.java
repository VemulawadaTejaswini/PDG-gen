import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++) s[i] = sc.next();
		boolean ok = true;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(i == j - 1) {
					if(s[i].charAt(s[i].length() - 1) != s[j].charAt(0)) ok = false;
				}
				if(s[i].equals(s[j])) ok = false;
			}
		}
		System.out.println(ok ? "Yes" : "No");
	}
}
