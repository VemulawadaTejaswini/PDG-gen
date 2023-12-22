import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String firstHalf = s.substring(0, (s.length() - 1) / 2);
		String secondHalf = s.substring((s.length() + 3) / 2 - 1, s.length());
		int count = 0;
		if(isPalindrome(s)){
			count++;
		}
		if(isPalindrome(firstHalf)){
			count++;
		}
		if(isPalindrome(secondHalf)){
			count++;
		}
		System.out.println(count == 3 ? "Yes" : "No");
	}
	
	static boolean isPalindrome(String s){
		boolean flg = true;
		for(int i=0; i<s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1)){
				flg = false;
				break;
			}
		}
		return flg;
	}
}
