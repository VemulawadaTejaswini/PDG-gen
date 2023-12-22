import java.util.*;
public class Main {
    public static void main(String[] args){
      	int count=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
      	if(!isPalindrome(str)){
          System.out.println("No");
          System.exit(0);
        }
      
      	String strFirst=str.substring(0,str.length()/2);
      	if(!isPalindrome(strFirst)){
          System.out.println("No");
          System.exit(0);
        }
      
      	String strLast=str.substring((str.length()+3)/2-1,str.length());
      	if(!isPalindrome(strLast)){
          System.out.println("No");
          System.exit(0);
        }
      	System.out.println("Yes");
    }
  	public static boolean isPalindrome(String str){
		StringBuffer sb = new StringBuffer(str);
		String reverseStr = sb.reverse().toString();
      	return str.equals(reverseStr);
    }

}