import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int X = sc.nextInt();
   int[] m = new int[N];
   int sum =0;
   for(int i=0;i<N;i++) 
   {
     m[i] = sc.nextInt();
     sum+=m[i];
   }

   Arrays.asList(m);
   
   System.out.println(sum+(X-sum)/m[0]);
 }
}