import java.io.*
import java.util.*

public class Solution{
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       int a = scan.nextInt();
       int b = scan.nextInt();
       scan.close();
       if(a>=b){
          System.out.println("delicious");
       }else if(b-a>=x){
          System.out.println("safe");
       }else{
           System.out.println("dangerous");
       }
   }
}