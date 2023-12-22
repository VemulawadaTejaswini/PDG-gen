import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[]aa){
      Scanner sc = new Scanner(System.in); 
     String S = sc.next();
      boolean result = S.substring(0,4).equals("YAKI") ? true:false;
      if(result){
            out.println("Yes");
      }else{
            out.println("No");
      }
   }
}
