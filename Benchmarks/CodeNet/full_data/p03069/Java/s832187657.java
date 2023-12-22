import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		
		int wcount = 0;
		int bcount = 0;
		
		System.out.println();
		
		char[] schar = s.toCharArray();
		
		for (int i = 0; i < n; i++) {
			if (schar[i] == '.') {
				wcount++;
			} else {
				
			}
			
		}
			
			int maxWcount = wcount; 
			
			int min = 0;
			
		for (int i = 0; i < n; i++) {
			if (schar[i] == '#') {
				bcount++;
			} else {
				wcount--;
			}
			
			min = Math.min(maxWcount, bcount + wcount);
		}
 	
	System.out.println(min);
	}
}