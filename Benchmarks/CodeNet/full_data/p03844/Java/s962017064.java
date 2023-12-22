import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		sc.close(); 

		int c = 0;
		int a = Integer.parseInt(s.substring(c, c+1));
		String op = s.substring(c+2, c+3);
		int b = Integer.parseInt(s.substring(c+4, c+5));
		if (op.equals("+"))
			System.out.println(a+b);
		if (op.equals("-"))
			System.out.println(a-b);	
	}
}
