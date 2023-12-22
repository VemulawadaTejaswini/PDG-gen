
import java.util.Scanner;

public class Main {
	static boolean isPalindrome(String s){
		for(int i = 0 ; i < s.length() ; ++i){
			int j = s.length() - 1 - i;
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int M = (N - 1) / 2;
		boolean f = isPalindrome(S) & 
				    isPalindrome(S.substring(0 , M)) &
	    			isPalindrome(S.substring(M + 1));

		if(f){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
