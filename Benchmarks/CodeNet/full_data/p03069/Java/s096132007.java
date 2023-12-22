import java.util.*;
public class Main {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		
		char black = '#';
		char white = '.';
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		char[] inputChars = s.toCharArray();
		
		int noneed = 0;
		for(int i = s.length() -1; i >= 0; i--) {
			if(inputChars[i] == black) {
				noneed++;
			}
			if(inputChars[i] == white) {
				break;
			}
		}
		
		char[] chars = Arrays.copyOf(inputChars, s.length() - noneed);
		int ans = 0;
		
		int tempBlack = 0;
		int tempWhite = 0;
		for(int i = 0; i < chars.length - 1; i++) {
			
			if(chars[i] == black) {
				tempBlack++;
			} else {
				tempWhite++;
			}
		}
		if(tempBlack > tempWhite) {
			ans = tempWhite;
		}
		
		String reString = "" + ans;
		System.out.println(reString);
	}
	
}