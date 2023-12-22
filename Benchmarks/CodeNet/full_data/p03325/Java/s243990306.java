import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   
   int[] ai = new int[N];
   for(int i=0;i<N;i++) ai[i]=sc.nextInt();

   int count =0;
   for(int i=0;i<30;i++)
   {
     for(int k = 0;k<N;k++)
     {  
      if(ai[i]%2==0)
      {
         ai[i] /=2;
         count++;
      }
     }
   }

   System.out.println(count);
 }
}