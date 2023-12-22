import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] tako = new int[N];
   for(int i =0;i<N;i++) 
   {
     tako[i] = sc.nextInt();
   }
   int sum = 0;
   for(int i = 0;i<N;i++){
     for(int k = i+1;k<N;k++){
       sum+= tako[i]*tako[k];
     }
   }
   System.out.println(sum);
 }
}