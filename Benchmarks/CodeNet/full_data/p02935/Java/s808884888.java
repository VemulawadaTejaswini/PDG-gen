import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Si = new int[N];
   for(int i = 0; i<N;i++)
   {
		Si[i] = sc.nextInt();       
   }
   Arrays.sort(Si);
   double half = ((double)Si[0]+(double)Si[1])/2;
   for(int i = 2; i<N;i++)
   {
		half = (half+(double)Si[i])/2;
   }
   System.out.println(half);
 }
}