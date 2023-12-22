import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int h = sc.nextInt();
      int w = sc.nextInt();
      int n = sc.nextInt();

      int max = Math.max(h,w);
      int count = 1;

      if (n==0) {
        System.out.println(0);
        System.exit(0);
      }

      for (int i = 1;i<h*w ;i++ ) {
        if (n<=max*i) {
          System.out.println(count);
          System.exit(0);
        }
        count++;
      }

  }
}
