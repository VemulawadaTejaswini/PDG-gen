import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] a = new int[N];
   for(int i =0;i<N;i++) a[i] =sc.nextInt();
   boolean br = true;
   int tmp = 1;
   int ans = -1;
   
   for(int i=1;i<=100000;i++)
   {
     tmp=a[tmp-1];
     if(tmp==2)
     {
       ans = i;
       break;
     }
   }
   System.out.println(ans);
 }
}