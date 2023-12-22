import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ans = 0;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == '-') ans--;
			else 
				ans++; 
		}
		System.out.println(ans);
	}
}