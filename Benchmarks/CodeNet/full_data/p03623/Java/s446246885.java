import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int x = sc.nextInt();
      
      if((x-a) > (x-b)){
          System.out.println("a");
      } else {
          System.out.println("b");
      }
      sc.close();
    }
}