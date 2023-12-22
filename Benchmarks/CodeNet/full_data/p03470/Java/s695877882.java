import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d[] = new int[n];
        for (int i = 0; i < n; i++)
            d[i] = sc.nextInt();
        Arrays.sort(d);
        int cnt = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (tmp == d[i]) {
                tmp = d[i];
                continue;
            } else
                cnt++;
            tmp = d[i];
        }
        System.out.println(cnt);
    }
}