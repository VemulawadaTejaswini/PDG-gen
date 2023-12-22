import java.util.Scanner;
import java.util.Arrays;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] p = new int[N];
   for(int i = 0; i<N ; i++){
   p[i] = sc.nextInt();
   }
   int count = 0;
 for(int i=0;i<N-1;i++){
   if(p[i] > p[i+1]) count++;
 }
  if(count<=1)  System.out.println("YES");  
  else System.out.println("NO");
 }
}