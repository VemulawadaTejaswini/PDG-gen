import java.util.Scanner;
import java.util.Arrays;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   if((A-B) % 2 = 1) System.out.println("IMPOSSIBLE");
   else {
    if (A>=B) System.out.println((A-B)/2);
    else System.out.println((B-A)/2); 
   }
 }
}