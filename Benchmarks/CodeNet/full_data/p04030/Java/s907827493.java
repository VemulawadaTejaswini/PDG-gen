import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String res = "";
		int[] skip = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'B') {
				if (i > 0)
					skip[i - 1] = 1;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (skip[i] == 0 && s.charAt(i) != 'B') {
				res += s.charAt(i);
			}
		}
		System.out.println(res);
	}
}