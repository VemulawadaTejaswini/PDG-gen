import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		ArrayList<String> set = new ArrayList<>();
		for(int i = 0; i < S.length(); i++) {
			set.add(S.substring(i, i + 1));
		}

		String ans = "z";
		String check = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < S.length(); i++) {
			String tmp = check.substring(i, i + 1);
			if(set.contains(tmp)) {
				if(i == S.length() - 1) {
					System.out.println("None");
					return;
				}
				continue;
			}else {
				ans = tmp;
				break;
			}
		}
		System.out.println(ans);
	}
}
