import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in); 
      int N = sc.nextInt();
      int A = sc.nextInt();
      out.println((N*N)-A);
      
   }
}