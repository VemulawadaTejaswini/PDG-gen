import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		char[] string = new char[n];
		String line = sc.next();
	    for (int i = 0; i < n; i++) {
	      string[i] =line.charAt(i);
	    }
		
		string[k-1] = Character.toLowerCase(string[k - 1]);
		
		for(int tmp = 0; tmp < string.length ; tmp++) {
			System.out.print(string[tmp]);
		}
	  }
}