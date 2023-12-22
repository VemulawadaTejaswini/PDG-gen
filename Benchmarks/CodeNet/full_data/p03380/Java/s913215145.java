import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] a = new int[N];
   for(int i=0;i<N;i++) 
   {
     a[i]= sc.nextInt();
   }
   Arrays.sort(a);
   int ans1=a[N-1];
   int ans2=0;
   int tmp=0;
   if(ans1%2==0)
   {
     for(int i=1;i<N-1;i++)
     {
       if(ans1/2<=a[i]) 
       {
         tmp = i;
         break;
       }
     }
     if(Math.abs(a[tmp-1]-ans1/2)>Math.abs(a[tmp]-ans1/2)) ans2=a[tmp];
     else ans2=a[tmp-1];
   }
   else
   {
          for(int i=1;i<N-1;i++)
     {
       if(ans1/2 +1<=a[i]) 
       {
         tmp = i;
         break;
       }
     }
     if(Math.abs(a[tmp-1]-ans1/2)>Math.abs(a[tmp]-(ans1/2 +1))) ans2=a[tmp];
     else ans2=a[tmp-1];
   }
   System.out.println(ans1+" "+ans2);  
 }
}