import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a;
      int count = 0;

      if (a==b) {
        System.out.println(1);
        System.exit(0);
      }

      for (int i = 1;sum<b ;i++ ) {
        sum = sum + a -1;
        count++;
      }
      System.out.println(count+1);
}
}
