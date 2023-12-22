import java.util.*;
	public class Main{
      public static void main(String[]args){
        Scanner s = new Scanner(System.in);
 		string s = sc.next;
        int n = s.length();
        
        String left = s.substring(0,(n-1)/2);
        String right =s.substring((n+3)/2-1,n);
        
        if(left.equals(right)){
          System.out.println("Yes");
        }else{System.out.println("No");
             }
      }
    }