import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
   int K = sc.nextInt();
 
   int[] re = {A,B,C};
   Arrays.sort(re);
   
   int d =1;
   for(int i =0;i<K;i++) d*=2;
 
   System.out.println(re[0]+re[1]+re[2]*d);
 }
}