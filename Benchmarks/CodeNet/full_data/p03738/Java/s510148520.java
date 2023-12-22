import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		if(a.length() > b.length()) ou.println("GREATER");
		else if(a.length() < b.length()) ou.println("LESS");
		else{
			boolean co = true;
			int ke = 0;
			while(co){
				co = false;
				if(ke == a.length()) ou.println("EQUAL");
				else if(a.charAt(ke) > b.charAt(ke)) ou.println("GREATER");
				else if(a.charAt(ke) < b.charAt(ke)) ou.println("LESS");
				else co = true;
				ke++;
			}
		}
		ou.flush();
	}
}