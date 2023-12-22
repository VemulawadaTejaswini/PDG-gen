// 314 15
// 9 26 5 35 8 9 79 3 23 8 46 2 6 43 3
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int t = sc.nextInt();
   int sum =0;
   while(t-->0){
       int b = sc.nextInt();
       sum+=b;
      
   }
  int r=0;
   if(a<sum){
       System.out.println(-1);
   }else
    r = a-sum;
     System.out.println(r);
     }
}