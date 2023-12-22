import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		int k = sc.nextInt(); 
		char[] s = sc.nextLine().toCharArray();
		s[k-1] = (char) (s[k-1] + 32);
		System.out.println(s);
	}
}