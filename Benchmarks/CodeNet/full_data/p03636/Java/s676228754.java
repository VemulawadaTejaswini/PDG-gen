import java.util.*;

public class Main{

	public static void main(String[] args){
           
            Scanner sc = new Scanner(System.in);
                   
            String S = sc.next();
            
            char s = S.charAt(0);
            char g = S.charAt(S.length() - 1);
          
            int size = S.length() - 2;
            
            System.out.println(s + String.valueOf(size) + g);            
            
        }        
}