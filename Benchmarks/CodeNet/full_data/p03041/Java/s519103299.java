import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next()) - 1;
		char[] s = sc.next().toCharArray();
		s[k] += 32;
		for(int i = 0 ; i < n ; i++) ou.print(s[i]);
		ou.println();
		ou.flush();
	}
}