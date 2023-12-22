import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String n = sc.next();
		int ans = 0;
		switch(n.length()) {
		case 1:
			ans = Integer.parseInt(n);
			break;
		case 2:
			ans = 9;
			break;
		case 3:
			ans = 9 + Integer.parseInt(n) - 99;
			break;
		case 4:
			ans = 9 + 900;
			break;
		case 5:
			ans = 9 + 900 + Integer.parseInt(n) - 9999;
			break;
		case 6:
			ans = 9 + 900 + 90000;
			break;
		}
		System.out.println(ans);
	}
}