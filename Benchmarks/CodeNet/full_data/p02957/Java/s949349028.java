import java.util.Scanner;
import java.util.Arrays;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   if(A>B)
   {
   if((A-B) % 2 == 1) System.out.println("IMPOSSIBLE");
    else System.out.println((A+B)/2); 
   }else{
     if((B-A) % 2 == 1) System.out.println("IMPOSSIBLE");
     else System.out.println((B+A)/2); 
   }
 }
}