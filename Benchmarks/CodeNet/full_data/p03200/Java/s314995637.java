import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int l = s.length;
		int left = 0;
		int ans = 0;
		for(int i = 0; i < l; i++) {
			if(s[i]=='W') {
				ans+=i-left;
				left++;
			}
		}
		System.out.println(ans);
	 }
}