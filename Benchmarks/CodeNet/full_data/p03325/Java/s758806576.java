import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   
   int[] ai = new int[N];
   for(int i=0;i<N;i++) ai[i]=sc.nextInt();

   int count =0;
  
   for(int k = 0;k<N;k++)
   {
     for(int i = 0;i<30;i++)
     {
       if(ai[k]%2==0)
       {
          ai[k] /=2;
          count++;
       }
       else break;
     }
   }
   

   System.out.println(count);
 }
}