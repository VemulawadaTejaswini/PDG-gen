
import java.io.*;
 
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char[] strKey = {'k','e','y','e','n','c','e'};
		String str = sc.nextLine();
		char[] S = str.toCharArray();
		int i = 0;
		int x = -1;
		String msg = "NO";
		if (str.indexOf(str) != -1 ) {
			System.out.println("YES");
			return;
		}
		

		for (char c:S) {
			if (c == strKey[i]) {
				i++;
				if (i == 6) {
					msg = "YES";
					break;
				}
			}
		}
		System.out.println(msg);
	}
}