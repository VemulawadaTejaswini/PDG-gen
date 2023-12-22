import java.util.*;
public class Main {
    /* 
    public static boolean isPalindrome(String str, int start, int end){
      if( end - start <= 1){
        return true;
      }
      else{
        if(str.indexOf(start) == str.indexOf(end)){
        	return isPalindrome(str,start+1,end-1);
        }
        else{
        	return false;
        }
      }
    }
    */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
 		String halfStr = str.substring(0,(str.length()+1)/2);
		// boolean isStrongPalindrome = isPalindrome(str,0,(str.length()+1)/2)
      	boolean isStrongPalindrome = new StringBuffer(halfstr).reverse().toString().equals(halfStr)
          && new StringBuffer(str).reverse().toString().equals(str);
          
		System.out.println(isStrongPalindrome?"Yes":"No");
	}
}