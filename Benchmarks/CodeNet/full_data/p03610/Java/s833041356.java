import java.util.*;

public class Main {
    
  public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);                      
               
      String s = "";
      
      String S = sc.next();
      
      for(int i = 0;i < S.length();i+=2){
          char ch = S.charAt(i);
          s += String.valueOf(ch);
      }
      
      System.out.println(s);
            
  }                
}