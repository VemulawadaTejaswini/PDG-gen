import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      double n = sc.nextDouble();
      double data=0;

      for (int i = 1; data<n; i++) {
        data = i*1.08;
        if((int)data==n){
          System.out.println(i);
          System.exit(0);
        }
      }
        System.out.println(":)");
  }
}