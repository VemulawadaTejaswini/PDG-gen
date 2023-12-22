import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		String q = "aiueo";
		boolean che = false;
		for(int i = 0 ; i < 5 && !che ; i++) if(s.charAt(0) == q.charAt(i)) che = true;
		if(che) ou.println("vowel");
		else ou.println("consonant");
		ou.flush();
	}
}