import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      long ans[] = new long[87];

      ans[0] = 2;
      ans[1] = 1;

      for(int cnt = 2; cnt <= N; cnt++) {
          ans[cnt] = ans[cnt-1] + ans[cnt-2];
      }

      System.out.println(ans[N]);

    }
}
