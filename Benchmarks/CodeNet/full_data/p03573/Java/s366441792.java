import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      int a = sc.nextInt();
      int b= sc.nextInt();
      int c = sc.nextInt();
      if(a==b){
         out.println(c);
      }else if(b==c){
         out.println(a);
      }else{
         out.println(b);
      }

   } 
}