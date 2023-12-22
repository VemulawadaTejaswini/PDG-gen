import java.io.*;

import java.text.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char[] strKey = {'k','e','y','e','n','c','e',};
		char[] S = sc.nextLine().toCharArray();
		int i = 0;
		int x = -1;
		
		String msg = "NO";
		
		for (char c:S) {
			if (c == strKey[i]) {
				i++;
				if (i == 6) {
					msg = "YES";
					break;
				}
				if (x == -1) {
					x = i;
				}
				if (x != i) {
					break;
				}
			}
		}
		System.out.println(msg);
	}

}
