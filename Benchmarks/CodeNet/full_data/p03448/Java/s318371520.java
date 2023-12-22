
import java.util.*;
class Main{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int t = 0;
   for(int i = 0;i <= a;i++){
    for(int q = 0;q <= b;q++){
      for(int h = 0; h <= c; h++){
        if(d == i * 500 + q * 100 + h * 50){
        t++;
        }
      }  
     }
    }
   System.out.println(t);
 } 
}