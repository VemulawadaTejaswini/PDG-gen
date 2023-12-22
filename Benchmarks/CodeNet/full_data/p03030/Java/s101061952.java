
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next() + " " + (Integer.MAX_VALUE - sc.nextInt()) + i;
		}
		
		Arrays.sort(s);
		
		for (String string : s) {
			System.out.println(Integer.parseInt(string.substring(string.length() - 1, string.length())) + 1);
		}
	}
}