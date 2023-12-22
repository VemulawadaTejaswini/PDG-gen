import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      int sum = 0;
      if (n<=k){
         sum = n*x;
      } else {
         sum = k*x+(n-k)*y;
      }
     System.out.println(sum);
      
    }
}