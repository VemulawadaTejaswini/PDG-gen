import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n = new String[3];
		int cnt = 0;
		n = sc.next().split(""); String msg = "";
		for(int i = 0; i < n.length; i++) {
			if (n[i].equals("7")) cnt++;
		}
		System.out.println(cnt > 0 ? msg = "Yes" : "No");
	}
}
