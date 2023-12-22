import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
      	int len = str.length();
 		String leftStr = str.substring(0,(len-1)/2);
      	String rightStr = str.substring((len+1)/2,len);
      	boolean isStrongPalindrome = new StringBuffer(leftStr).reverse().toString().equals(leftStr)
          && new StringBuffer(rightStr).reverse().toString().equals(rightStr)
          && new StringBuffer(str).reverse().toString().equals(str);
          
		System.out.println(isStrongPalindrome?"Yes":"No");
	}
}
