import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int d = sc.nextInt();
   int n = sc.nextInt();
   if (d == 0) {
     if(n == 100){
       System.out.println("101");
     }else{
       System.out.println(n);
     }
   }else if (d == 1) {
     System.out.println(100 * n);
   }else{
     System.out.println(10000 * n);
   }
  }
}
