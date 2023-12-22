import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int onePlace = -1;
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            if (onePlace == -1 && a[i] == 1) onePlace = i;
        }

        int min = 100000;
        for (int i = 0 ; i < k ; i++) {
            int cnt = 1;
            cnt = cnt + (onePlace - i) / (k - 1);
            if ((onePlace-i)%(k-1) != 0) cnt++;
            cnt = cnt + ((n-onePlace-1) - (k-i-1)) / (k - 1);
            if ((n-onePlace-1)-(k-i-1) / (k - 1) != 0) cnt++;
            min = Math.min(cnt,min);
        }
        System.out.println(min);
    }
}