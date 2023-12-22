import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		int n = 700;
		for(int i = 0 ; i < 3 ; i++) if(s.charAt(i) == 'o') n += 100;
		ou.println(n);
		ou.flush();
	}
}