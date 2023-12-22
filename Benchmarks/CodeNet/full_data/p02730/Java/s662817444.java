//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(isPalindrom(S,0,S.length()-1)) {
			if(isPalindrom(S,0,(S.length()-2)/2)) {
				if(isPalindrom(S,(S.length()+2)/2,S.length()-1)) {
					System.out.println("Yes");
				}
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}
		
	
	}
	public static boolean isPalindrom(String S,int minIdx,int maxIdx) {
//		int minIdx = 0;
//		int maxIdx = S.length()-1;
		while(minIdx<maxIdx) {
			if(S.charAt(minIdx++)!=S.charAt(maxIdx--)) {
				return false;
			}
		}
		return true;
	}
}