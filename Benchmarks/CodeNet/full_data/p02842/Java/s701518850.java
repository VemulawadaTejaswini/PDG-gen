import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      for (int i = 1; i<=n; i++) {
        if((int)(i*1.08)==n){
          System.out.println(i);
          System.exit(0);
        }
      }
        System.out.println(":)");
  }
}