

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String w;
		int count[];
		count = new int[27];
		boolean ans = true;
		
		w = sc.next();
		
		for(int i = 0; i < w.length(); ++i) {
			++count[w.charAt(i)-'a'];
		}
		
		for(int i = 0; i < 27; ++i) {
			if(count[i] % 2 == 1) {
				ans = false;
				break;
			}
		}
		
		if(ans) System.out.println("Yes");
		else System.out.println("No");
		
		sc.close();
	}

}
