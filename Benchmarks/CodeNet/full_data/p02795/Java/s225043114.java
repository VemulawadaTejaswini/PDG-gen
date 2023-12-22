import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int h = sc.nextInt();
      int w = sc.nextInt();
      int n = sc.nextInt();

      int max = Math.max(h,w);
      int count = 0;

      for (int i = 1;i<n ;i++ ) {
        if (n<=max*i) {
          System.out.println(count+1);
          System.exit(0);
        }
        count++;
      }

  }
}
