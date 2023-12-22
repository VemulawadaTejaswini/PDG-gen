
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String msg = "No";
		char ch[] = sc.next().toCharArray();
		
		int first = 0;
		int second = 0;
		int count = 0;
		
		boolean isOdd = (ch.length % 2 == 0);
		if (ch.length == 0) {
			System.out.println(0);
			return;
		}
		// 0が先頭ケース
		for (int i = 0; i < ch.length; i += 2) {
			if (ch[i] == '0') {
				first++;
			}
		}
		for (int i = 1; i < ch.length; i += 2) {
			if (ch[i] == '1') {
				first++;
			}
		}
		
		// 0が先頭ケース
		for (int i = 0; i < ch.length; i += 2) {
			if (ch[i] == '1') {
				second++;
			}
		}
		for (int i = 1; i < ch.length; i += 2) {
			if (ch[i] == '0') {
				second++;
			}
		}
		count = first > second ? first : second;
		
		if (isOdd) {
			count = ch.length - count;
		}else{
			count = ch.length - count;
		}
		
		System.out.println(count);
	}
}