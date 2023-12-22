

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//65~90 A~Z
		int N = scan.nextInt();
		String S = scan.next();
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = S.toCharArray();
		for(char c: charArray) {
			int targetIndex = c + N;
			if(targetIndex > 90) {
				targetIndex -= 26;
			}
			char changedChar = (char)targetIndex;
			sb.append(changedChar);
		}
		
		System.out.println(sb);
		scan.close();
	}
}


