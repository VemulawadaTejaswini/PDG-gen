import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] as = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
        sc.close();
        int ans = 1;
        boolean isOrd = true;
        int i = 0;
        for (i = 1; i < n-1; i++)
            if (as[i] != as[i-1]) {
                isOrd = as[i-1] < as[i];
                break;
            }
        for (; i < n; i++) {
            if (as[i-1] == as[i])
                continue;
            if ((isOrd && as[i-1] < as[i]) || (!isOrd && as[i-1] > as[i])) {

            }
            else {
                if (i < n - 1)
                    isOrd = as[i] < as[i+1];
                ans++;
            }
        }
        System.out.println(ans);
    }
}
