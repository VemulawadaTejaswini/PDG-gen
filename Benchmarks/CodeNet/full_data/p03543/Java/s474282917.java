import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      int N1000 = N / 1000;
      N = N % 1000;
      int N100 = N / 100;
      N = N % 100;
      int N10 = N / 10;

      if((N1000 == N100)&&(N100 == N10)) {
          System.out.println("Yes");
      }
      else {
          System.out.println("No");
      }

    }
}
