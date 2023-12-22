import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String temp = S.substring(0, 1);
		int cnt = 0;
		for(int i = 1; i < S.length(); i++) {
			if(!S.substring(i, i + 1).equals(temp)) {
				cnt++;
				temp = S.substring(i, i + 1);
			}
		}
		System.out.println(cnt);
	}
}
