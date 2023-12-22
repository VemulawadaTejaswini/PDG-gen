import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 String a = sc.nextLine();
		 System.out.println(myFunction(a));
	}
	
	public static String myFunction(String s) {
		if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) return "Yes";
		return "No";
    }
}