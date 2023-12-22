import java.io.*;
import java.util.*;


public class Main {
	
	public static String altStr(String str, char let, boolean direction) {
		String letter = "";
		if(let == 'W') {
			if(direction) {
				int num = 1;
				while(str.charAt(num) == 'W') {
					num++;
					letter = "B" + letter;
				}
				str = "B" + letter + str.substring(num);
			} else {
				int num = str.length()-2;
				while(str.charAt(num) == 'W') {
					num--;
					letter = "B" + letter;
				}
				str = str.substring(0, num) + letter + "B";
			}
		}else {
			if(direction) {
				int num = 1;
				while(str.charAt(num) == 'B') {
					num++;
					letter += "W";
				}
				str = "W" + letter + str.substring(num);
			} else {
				int num = str.length()-2;
				while(str.charAt(num) == 'B') {
					num--;
					letter += "W";
				}
				str = str.substring(0, num) + letter + "W";
			}
		}
		return str;
	}
	public static void main(String[] args) {
		int min1 = 0;
		int min2 = 0;
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String str1 = new String(s);
		String str2 = new String(s);
		if(s.indexOf("W") == -1 || s.indexOf("B") == -1) {
			System.out.print(0);
		}
		else {
			while(str1.indexOf("W") != -1 && str1.indexOf("B") != -1 && str2.indexOf("W") != -1 && str2.indexOf("B") != -1) {
				str1 = altStr(str1, str1.charAt(0), true);
				str2 = altStr(str2, str2.charAt(str2.length()-1), false);
				min1++; 
				min2++;
			}
			if(min1 < min2) {
				System.out.println(min1);
			} else {
				System.out.println(min2);
			}
		}
	}
}


