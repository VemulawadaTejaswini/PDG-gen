import java.io.*;
import java.util.*;

public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int result = 0;
		int start = 0;
		int end = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A' && start == 0) {
				start = i;
			} else if(s.charAt(i) == 'Z') {
				end = i;
			}
		}
		result = s.substring(start, end+1).length();
		
		
		System.out.println(result);

		sc.close();
	}
	
}