import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = s.length;
		long[] num = new long[n+1];
		long c = 0;
		for(int i = 0; i < n; i++) {
			if (s[i] == '<') c++;
		      else c = 0;
		      num[i + 1] = c;
		}
		long ans = 0;
		long count = 0;
		for(int i = n-1; i >= 0; i--) {
			if(s[i]=='>') {
				count++;
			}
			else count = 0;
			num[i] = Math.max(num[i], count);
		}
		for (long value : num) ans += value;
		System.out.println(ans);
	 }
}