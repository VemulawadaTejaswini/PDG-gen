import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long h = sc.nextLong();

            int cnt = 1;
            while (h/2 >= 1) {
                cnt++;
                h = h/2;
            }

            long result = calc(cnt) - 1;

            System.out.println(result);
        }
    }

    static long calc(int n){
          if(n == 0){
            return 1;
          }
          return 2 * calc(n-1);
    }
}