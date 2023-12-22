import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] ci= new int[N];
   for(int i = 0;i<N;i++) ci[i] = sc.nextInt();
   Arrays.sort(ci);
   int sum = 0;
   for(int i = 0;i<N;i++) sum += ci[i];
   
   for(int i = 0;i<N;i++)
   {
     if(ci[i]%10!=0) 
     {
       sum -=ci[i];
       break;
     }
   }
   if(sum%10==0) System.out.println(0);
   else System.out.println(sum);
 }
}