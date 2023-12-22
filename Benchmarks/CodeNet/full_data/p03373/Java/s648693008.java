import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int nab = 0;
        int answer = Integer.MAX_VALUE;
        while(true) {
            int x = X - nab/2;
            int y = Y - nab/2;
            int v = x * A + y * B + nab * C;
            if ( v < answer ) {
                answer = v;
            }
            nab = nab + 2;
            if ( X - nab/2 < 0 || Y - nab/2 < 0 ) {
                break;
            }
        };
        System.out.println(answer);
    };
  }
}