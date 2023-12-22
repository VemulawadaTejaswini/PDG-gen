import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] times = new int[n];
        for(int i = 0; i < n; i++)
            times[i] = sc.nextInt();

        long total = 0;
        int start = 0;
        for(int i = 0; i < n; i++) {
          if(i == 0) {
              if(times[i] > t) {
                  total += t;
                  start = times[i];
              }
          } else {
              if(times[i] > times[i-1] + t) {
                total += times[i-1] - start + t;
                start = times[i];
              }
          }
          if(i == n - 1)
            total += times[i] - start + t;
        }

        System.out.println(total);
    }
}
