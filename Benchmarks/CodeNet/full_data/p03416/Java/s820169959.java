import java.util.*;

public class Main {

  public static void main(String args[])
  {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	String[] inputs = input.split(" ");
    	int low = Integer.valueOf(inputs[0]);
    	int high  = Integer.valueOf(inputs[1]);
    	int count = 0 ;
		for( int i = low; i<=high ; i++) {
          	if ( checkPalindrome(i)){
            	count++;
            }
        }
    	System.out.println(count);	
  }
  
  private static boolean checkPalindrome(int num) {
    	String numString = String.valueOf(num);
    	int length = numString.length();
    	int parseLength = length%2==0?length/2:length/2+1;
    	
    	for( int i = 0 ; i<parseLength ; i++ ) {
        	if( !numString.substring(i,i+1).equals(numString.substring(length-i-1,length-i))) 
        		return false;
        }
        return true;
    
    
  }
}