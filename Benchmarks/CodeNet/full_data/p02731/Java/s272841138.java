import java.util.*;
import java.math.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   double L = sc.nextInt();
   double ret = Math.pow((L/3),3);
   System.out.println(BigDecimal.valueOf(ret).toPlainString());
}
  static boolean isPalindrome (String s) {
	int n = s.length();
	for (int i=0; i<n/2; i++) {
		if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
	}
	return true;
}
}
