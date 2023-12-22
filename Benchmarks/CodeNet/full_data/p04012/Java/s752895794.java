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
		char[] c_array = s.toCharArray();
		Map<Character, Integer> counter = new HashMap<Character, Integer>();
		for (char c : c_array) {
			counter.put(c, counter.get(c) == null?1:counter.get(c) + 1);
		}
		int flag = 0;
		for (char key : counter.keySet()) {
			if (counter.get(key) % 2 != 0) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("no");
		}
		else 
			System.out.println("yes");
	}
}