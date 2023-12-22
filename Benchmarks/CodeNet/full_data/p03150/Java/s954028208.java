import java.io.*;

import java.text.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char[] strKey = {'k','e','y','e','n','c','e',};
		char[] S = sc.nextLine().toCharArray();
		int i = 0;
		String msg = "NO";
		
		for (char c:S) {
			if (c == strKey[i]) {
				i++;
				if (i == 6) {
					msg = "YES";
				}
			}
		}
		System.out.println(msg);
	}

}
