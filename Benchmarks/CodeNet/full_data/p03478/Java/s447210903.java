import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int A = sc.nextInt();
   int B = sc.nextInt();
   
   int digitsum = 0;
   int tmp;
   int count = 0;
   for(int k = 1;k<=N;k++)
   {
    digitsum=0;
    tmp = k;
    for(int i = 0;i<5;i++)
    {
      digitsum += tmp%10;
      tmp -= k%10;
      tmp = k/10;
    }
    if(digitsum>=A&&digitsum<=B) count++;
   }
   System.out.println(count);
 }
}