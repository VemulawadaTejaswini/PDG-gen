/**
 * 
 */
/**
 * @author meng
 *
 */
package test;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		char[] c_array = new char[256];
		for (int i = 0;i < s.length();i++) {
			//System.out.println(s.charAt(i));
			c_array[(int)s.charAt(i)]++;
		}
		int flag = 0;
		for (int i = 0;i < 256;i++) {
			if (c_array[i] % 2 != 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) 
			System.out.println("no");
		else
			System.out.println("yes");
	}
}