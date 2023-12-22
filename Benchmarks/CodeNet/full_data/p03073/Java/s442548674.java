import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String S = sc.nextLine();
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) == S.charAt(i-1)) {
				if (S.charAt(i) == '0') {
					S = S.substring(0, i) + "1" + S.substring(i+1);
					count++;
				}
				else if (S.charAt(i) == '1') {
					S = S.substring(0, i) + "0" + S.substring(i+1);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
