import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int A = sc.nextInt();
   int B = sc.nextInt();
   int X = sc.nextInt();

   if((B-A)/2 +1 >=X)
   {
     for(int i = A;i<=B;i++)
     {
       System.out.println(i);
     }
   }
   else
   {
     for(int i =A;i<=A+X-1;i++)
     {
       System.out.println(i); 
     }
     for(int i =B-X+1;i<=B;i++)
     {
       System.out.println(i);
     }
   }
 }
}