import java.util.*;

 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] s = S.toCharArray();
		int n = S.length();
		boolean OK = true;
		if(n%2 != 0) {
			int i = 0;
			int j = (n-1)/2-1;
			while(j-i>=1) {
				if(s[i]==s[j] && s[n-1-i]==s[n-1-j]) {
				i++;
				j--;
				} 
				else {
					OK = false;
					break;
				}
			}
		}
		else {
			int i = 0;
			int j = (n-1)/2;
			while(j-i>=1) {
				if(s[i]==s[j] && s[n-1-i]==s[n-1-j]) {
				i++;
				j--;
				} 
				else {
					OK = false;
					break;
				}
			}
		}
		System.out.println(OK?"Yes":"No");
	}
}