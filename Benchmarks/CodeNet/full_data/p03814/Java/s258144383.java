import java.util.Scanner;

public class Main{

   public static void main(String[] args){
      
      Scanner reader = new Scanner(System.in);
      
      String s = reader.next();
      int iA = 0;
      int iZ = 0;
      
      for(int i = 0; i < s.length(); i++){
         String l = s.substring(i, i+1);
         if(l.equals("A") && iA == 0){
            iA = i;
         } else if(l.equals("Z") && i > iZ){
            iZ = i;
         }
      }
      
      System.out.println(iZ - iA + 1);
   }
}
         
         
      
      
      