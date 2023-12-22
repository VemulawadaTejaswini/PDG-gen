import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int[] now = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			c[i]=1;
			now[i]=1;
		}
		for(int i = 0; i < n/2; i++) {
			for(int j = 0; j < n; j++) {
				//System.out.println(s.charAt(j));
				if(s.charAt(j)=='R') {
					c[j+1]+=now[j];
					c[j]-=now[j];
				}
				else if(s.charAt(j)=='L') {
					c[j-1]+=now[j];
					c[j]-=now[j];
				}
			}
			for(int j = 0; j < n; j++) {
				now[j] = c[j];
			}
		}
		String ans = "";
		for(int i = 0; i < n; i++) {
			if(i==0) {
				ans+=c[i];
			}
			else {
				ans+=" ";
				ans+=c[i];
			}
		}
		System.out.println(ans);
	 }
}