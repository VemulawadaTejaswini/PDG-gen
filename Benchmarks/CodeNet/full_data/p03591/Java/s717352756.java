import java.util.*;

public class Main {                   
    
  public static void main(String[] args) {                     
      
      Scanner sc = new Scanner(System.in);
      
      String S = sc.next();
      
      if(S.length() < 4){
          System.out.println("NO");
          return;
      }
      
      if(S.substring(0,4).equals("YAKI")){
          System.out.println("YES");
          return;
      }else{
          System.out.println("NO");
          return;
      }
  
      
  }   
   
}
   