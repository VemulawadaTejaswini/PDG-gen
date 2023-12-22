import java.util.*;
public class Test {

   public static void main(String args[]) {
     Scanner scn=new Scanner(System.in);
     System.out.println("enter the string");
      String S=scn.next();
      for(int i=0;i<=S.length()-1;i++)
      {
      
        
     System.out.print(S.replace(S,"x"));
    
      }
   } 
}
