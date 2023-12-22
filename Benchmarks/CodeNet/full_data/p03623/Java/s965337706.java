import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int j = 0;
      int k = 0;
      
      if(x > a){
          j = x - a;
      } else {
          j = a - x;
      }
      if(x > b){
          k = x - b;
      } else {
          k = b - x;
      }
      
      if(j < k){
          System.out.println("A");
      } else {
          System.out.println("B");
      }
      sc.close();
    }
}