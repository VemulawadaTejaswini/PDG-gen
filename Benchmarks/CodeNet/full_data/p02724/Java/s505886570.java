import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int a = N / 500;
            int b = (N % 500) / 5;
            System.out.println(a*1000 + b * 5);
          }
}