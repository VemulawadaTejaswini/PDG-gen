import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int A = sc.nextInt();
   int B = sc.nextInt();
   int ans = -1;
   for(int i = 1 ; i<=100 ; i++)
   {
     if((i*8)/100==A && i/10 == B)
     {
       ans = i;
       break;
     }
   }
   System.out.print(ans);
 }
}