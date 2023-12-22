import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int l = n;
		if(l%2==0) {
			String s1 = s.substring(0,l/2-1);
			String s2 = s.substring(l/2, l-1);
			if(s1.equals(s2)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else {
			System.out.println("No");
		}
		
	 }
}