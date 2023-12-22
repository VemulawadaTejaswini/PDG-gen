import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String s = sc.next();
		int count = 0;
		String s1 = s.replace("ABC", "");
		int diff = s.length()-s1.length();
		System.out.println(diff/3);
	}

}