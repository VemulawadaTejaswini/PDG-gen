package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try (Scanner sc = new Scanner(br)) {
			int len = sc.nextInt();
			int numOfQuestion = sc.nextInt();
			String str = sc.next();
			question(str, numOfQuestion, sc);
		}
	}

	private static void question(String str, int numOfQuestion, Scanner sc) {
		int[] ans = new int[numOfQuestion];
		for (int i = 1; i <= numOfQuestion; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			ans[i-1] = countAC(str.substring(l - 1, r));
		}
		
		for (int i : ans) {
			System.out.println(i);
		}
	}

	private static int countAC(String str) {
		char[] chars = str.toCharArray();
		int len = chars.length;
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			if (chars[i] == 'A' && chars[i + 1] == 'C') {
				count++;
				i++;
			}
		}
		return count;
	}
}
